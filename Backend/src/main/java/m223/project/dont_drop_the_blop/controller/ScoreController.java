package m223.project.dont_drop_the_blop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;
import m223.project.dont_drop_the_blop.dto.ScoreRequest;
import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.service.ScoreService;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {
    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping("/add")
    public void addScore(@RequestBody ScoreRequest scoreRequest) {
        scoreService.saveScore(scoreRequest.getUserId(), scoreRequest.getScore());
    }

    @GetMapping("/top10")
    public List<User> getTop10() {
        return scoreService.getTop10Players();
    }

    @DeleteMapping("/{userId}/clear")
    public void clearScores(@PathVariable Long userId) {
        scoreService.clearUserScores(userId);
    }
}
