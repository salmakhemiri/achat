package com.esprit.achat.persistence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    @Column(unique = true)
    private String userName;
    @NonNull
    private String email;
    @NonNull
    private String password;


    private boolean locked;

    private boolean enabled;

    private boolean isDeleted;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date modifiedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date deletedAt;


    @Temporal(TemporalType.DATE)
    @Transient
    private Date birthDate;

    @NonNull
    private Integer age;

    @Column(name = "resettoken")
    private String resettoken;
    @ManyToMany(cascade = CascadeType.ALL)

    @ToString.Exclude
    @JsonIgnore
    private List<Role> roles;

/*
    public boolean isEnabled() {
        return enabled;
    }
    //-----------------userDetails--------------------------

    public User(Integer id) {
        this.idUser=id;
    }






   @OneToMany(cascade = CascadeType.ALL, mappedBy = "appuser")
   private List<Reclamation> reclamation;
   @ManyToMany(mappedBy = "appuser", cascade = CascadeType.ALL)
    private List<Publicite> publicite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appuser")
    private List<Chat> chat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appuser")
    private List<Reclamation> reclamations;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appuser")
    private List<Commentaire> commentaire;
    @JsonIgnore
    @OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER,mappedBy = "appuser")
    private List<Historique> searchs;

 */
}
