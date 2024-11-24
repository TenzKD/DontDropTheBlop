package m223.project.dont_drop_the_blop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreRequest {
    private Long userId;
    private Integer score;
}
