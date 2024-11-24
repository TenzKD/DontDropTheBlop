package m223.project.dont_drop_the_blop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public void addScore(@RequestParam Long userId, @RequestParam Integer score){
        scoreService.saveScore(userId, score);
    }

    @GetMapping("/top10")
    public List<User> getTop10(){
        return scoreService.getTop10Players();
    }
}
