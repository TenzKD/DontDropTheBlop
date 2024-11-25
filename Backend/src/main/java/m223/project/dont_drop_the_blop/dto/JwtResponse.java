package m223.project.dont_drop_the_blop.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the JWT response sent to the client after authentication.
 * - Contains the token, token type, user ID, username, score, and roles.
 */
@Setter
@Getter
public class JwtResponse {

  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private int score;
  private List<String> roles;

  public JwtResponse(String accessToken, Long id, String username, int score, List<String> roles) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.score = score;
    this.roles = roles;
  }
}
