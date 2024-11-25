package m223.project.dont_drop_the_blop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.repositories.UserRepository;

/**
 * This Controller main function gives endpoints to show all users and to
 * block/unblock users based on their username. instead of userid for easier
 * blocking. Those endpoints below should only be able to access by role admin
 */
@RestController
@RequestMapping("/private")
public class SecureController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/users")
  public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = userRepository.findAll();
    return ResponseEntity.ok(users);
  }

  @PutMapping("/block/{username}")
  @Transactional
  public ResponseEntity<?> blockUser(@PathVariable String username) {
    // FETCH User by name
    User user = userRepository.findByUsername(username)
        .orElseThrow(() -> new RuntimeException("Error: User not found."));

    if (user.isBlocked()) {
      // unblock user
      user.setBlocked(false);

      // Save the updated user
      userRepository.save(user);

      // return success response
      return ResponseEntity.ok("User unblocked successfully.");
    } else {
      // Block user and reset score and highscore
      user.setBlocked(true);
      user.setHighScore(0);

      // Save the updated user
      userRepository.save(user);

      // return success response
      return ResponseEntity.ok("User blocked successfully.");
    }
  }
}
