package m223.project.dont_drop_the_blop.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class JwtResponse{

  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private int score;
  private List<String> roles;

  public JwtResponse(String accessToken, Long id, String username,int score, List<String> roles) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.score = score;
    this.roles = roles;
  }
}
