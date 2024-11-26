package m223.project.dont_drop_the_blop.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import m223.project.dont_drop_the_blop.model.ERole;
import m223.project.dont_drop_the_blop.model.Role;

/**
 * Repository interface for accessing Role entities in the database.
 * - Provides a method to find a Role by its name (ERole).
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
