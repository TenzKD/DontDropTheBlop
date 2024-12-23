package m223.project.dont_drop_the_blop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import m223.project.dont_drop_the_blop.model.ERole;
import m223.project.dont_drop_the_blop.model.Role;
import m223.project.dont_drop_the_blop.repositories.RoleRepository;

/**
 * Main entry point for the Spring Boot application.
 * - Implements CommandLineRunner to initialize roles (USER and ADMIN) in the
 * database if they don't exist.
 * - Runs the application and performs role initialization on startup.
 */
@SpringBootApplication
public class DontDropTheBlopApplication implements CommandLineRunner {

	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {

		SpringApplication.run(DontDropTheBlopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (roleRepository.count() == 0) {
			roleRepository.save(new Role(ERole.ROLE_USER));
			roleRepository.save(new Role(ERole.ROLE_ADMIN));
		}

	}
}
