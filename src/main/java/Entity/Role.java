package Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String prenom;
    private String nom;
    private String password;
    @Enumerated(EnumType.STRING)
    private Fonction fonction;

}
