package pl.springExercises.users.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter /*używając pluginu Lombok można generować za pomocą adnotacji Gettery i Settery*/
@Setter
@EqualsAndHashCode
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String password;
    @ManyToOne
    private GroupEntity groupEntity;

}
