package com.esprit.achat.persistence.entity;

import com.esprit.achat.persistence.enumeration.MotInterdit;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Commentaire implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    private Long like;
    private String emoji;
    @Enumerated(EnumType.STRING)
    private MotInterdit motinterdit;
    /*
    @ManyToOne
    User appuser;

     */
}
