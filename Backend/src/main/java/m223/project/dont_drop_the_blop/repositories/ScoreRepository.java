package m223.project.dont_drop_the_blop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import m223.project.dont_drop_the_blop.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Long>{
    
}
