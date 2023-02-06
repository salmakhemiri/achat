package com.esprit.achat.persistence.entity;

import com.esprit.achat.persistence.enumeration.type;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

public class Reclamation implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private type Type;
    @ManyToOne
    User acheteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reclamations")
    private List<Rating> rating;

}
