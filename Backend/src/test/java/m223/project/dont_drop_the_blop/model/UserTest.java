package m223.project.dont_drop_the_blop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void test() {
        assertTrue(true);
    }

    // Test the default settings for a created user
    @Test
    public void testDefaultValues() {
        User user = new User();
        assertNotNull(user.getScores(), "Scores set should be initialized.");
        assertTrue(user.getScores().isEmpty(), "Scores set should be empty by default.");
        assertFalse(user.isBlocked(), "User should not be blocked by default.");
        assertEquals(0, user.getHighScore(), "High score should be 0 by default.");
    }

    // Test to add a score for a created User
    @Test
    public void testAddScoreToUser() {
        User user = new User();
        Score score = new Score();
        score.setValue(100);
        score.setUser(user);

        user.getScores().add(score);

        assertEquals(1, user.getScores().size(), "User should have one score.");
        assertTrue(user.getScores().contains(score), "Users scores should include the added score.");
        assertEquals(user, score.getUser(), "Scores user reference should point to the correct user.");
    }
}
