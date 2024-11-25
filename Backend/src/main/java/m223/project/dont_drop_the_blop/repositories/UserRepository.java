package m223.project.dont_drop_the_blop.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import m223.project.dont_drop_the_blop.model.User;

/**
 * Repository interface for accessing User entities in the database.
 * - Provides methods to find a user by username, check if a username exists,
 * and fetch the top 10 users based on high score.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    List<User> findTop10ByOrderByHighScoreDesc();
}
