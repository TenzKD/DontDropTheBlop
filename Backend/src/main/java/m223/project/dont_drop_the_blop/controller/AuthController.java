package m223.project.dont_drop_the_blop.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import m223.project.dont_drop_the_blop.config.JwtUtils;
import m223.project.dont_drop_the_blop.config.UserDetailsImpl;
import m223.project.dont_drop_the_blop.dto.JwtResponse;
import m223.project.dont_drop_the_blop.dto.LoginRequest;
import m223.project.dont_drop_the_blop.dto.SignupRequest;
import m223.project.dont_drop_the_blop.model.ERole;
import m223.project.dont_drop_the_blop.model.Role;
import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.repositories.RoleRepository;
import m223.project.dont_drop_the_blop.repositories.UserRepository;

/**
 * Functions main task is to create an endpoint for new users to register and
 * already registered users to login
 * For the login enpoint it also checks if the user is blocked by the admin if
 * so they can't login anymore until unblocked.
 * It also checks if the username is already taken to make sure every user has a
 * unique name
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    // Check if User is blocked
    User user = userRepository.findByUsername(loginRequest.getUsername())
        .orElseThrow(() -> new RuntimeException("Error: User not found"));

    if (user.isBlocked()) {
      return ResponseEntity.badRequest().body("Error: User is blocked and cannot log in.");
    }

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);

    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt,
        userDetails.getId(),
        userDetails.getUsername(),
        userDetails.getScore(),
        roles));
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
      return ResponseEntity
          .badRequest()
          .body("Error: Username is already taken!");
    }

    // Create new user's account
    User user = new User(signUpRequest.getUsername(), encoder.encode(signUpRequest.getPassword()), 0);
    user.setBlocked(false);

    // ASSIGN DEFAULT ROLE ROLE_USER
    Role userRole = roleRepository.findByName(ERole.ROLE_USER)
        .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
    Set<Role> roles = new HashSet<>();
    roles.add(userRole);

    user.setRoles(roles);
    userRepository.save(user);

    return ResponseEntity.ok("User registered successfully!");
  }
}
