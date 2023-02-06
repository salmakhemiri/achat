package com.esprit.achat.persistence.entity;
import com.esprit.achat.persistence.enumeration.Methode;
import com.esprit.achat.persistence.enumeration.Status;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Publicite  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    private String link;
    private String poster;
    @Enumerated(EnumType.STRING)
    private Methode methode;
    private float budget;
    private boolean promotefb;
    private boolean prometgoogle;
    private int estimatedviews;
    private int currentviews;

    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    User appuser;



}
