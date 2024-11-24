package m223.project.dont_drop_the_blop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import m223.project.dont_drop_the_blop.model.Score;
import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.repositories.ScoreRepository;
import m223.project.dont_drop_the_blop.repositories.UserRepository;

@Service
public class ScoreService {
    private final UserRepository userRepository;
    private final ScoreRepository scoreRepository;

    public ScoreService(UserRepository userRepository, ScoreRepository scoreRepository){
        this.userRepository = userRepository;
        this.scoreRepository = scoreRepository;
    }

    @Transactional
    public void saveScore(Long userId, Integer scoreValue){
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
    
    Score score = new Score();
    score.setValue(scoreValue);
    score.setUser(user);
    scoreRepository.save(score);

    if(user.getHighScore() == null || scoreValue > user.getHighScore()){
        user.setHighScore(scoreValue);
        userRepository.save(user);
    }
}

public List<User> getTop10Players() {
    return userRepository.findTop10ByHighScoreOrderByHighScoreDesc();
}
}
