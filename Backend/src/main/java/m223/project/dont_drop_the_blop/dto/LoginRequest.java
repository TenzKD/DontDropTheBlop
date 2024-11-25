package m223.project.dont_drop_the_blop.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the login request sent by the client.
 * - Contains the username and password fields.
 */
@Setter
@Getter
public class LoginRequest {

  private String username;
  private String password;
}
