package m223.project.dont_drop_the_blop.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a request to update or submit a user's score.
 * - Contains the user ID and the score value.
 */
@Getter
@Setter
public class ScoreRequest {
    private Long userId;
    private Integer score;
}
