package m223.project.dont_drop_the_blop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a role assigned to a user.
 * - Contains an ID and the role name (from the ERole enum).
 * - Provides a constructor to set the role name and a toString method to return
 * the role name as a string.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }

    public String toString() {
        return name.toString();
    }
}
