package m223.project.dont_drop_the_blop.config;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.repositories.UserRepository;

/**
 * Service to load user details by username for authentication.
 * - Fetches the user from the database using the UserRepository.
 * - Converts user roles into granted authorities.
 * - Returns a UserDetailsImpl object for Spring Security.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
    Set<GrantedAuthority> authorities = user.getRoles().stream()
        .map((role) -> new SimpleGrantedAuthority(role.toString()))
        .collect(Collectors.toSet());
    return UserDetailsImpl.build(user);
  }
}
