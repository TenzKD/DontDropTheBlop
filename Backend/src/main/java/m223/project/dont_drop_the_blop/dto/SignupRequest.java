package m223.project.dont_drop_the_blop.dto;

import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents the signup request for creating a new user.
 * - Contains the username, roles, and password fields with validation
 * constraints.
 */
@Setter
@Getter
public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  private Set<String> roles;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;
}
