package com.esprit.achat.persistence.entity;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "historique")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Historique implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id = 0;

    private String search;
    /*
    @JsonIgnore
    @ManyToOne(fetch= FetchType.EAGER)
    private User user;

    public Historique() {
        super();
    }
    public Historique(String search, User user) {
        super();
        this.search = search;
        this.user = user;
    }
    public Long getIdHistorique() {
        return idHistorique;
    }
    public void setIdHistorique(Long idHistorique) {
        this.idHistorique = idHistorique;
    }
    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "Historique [idHistorique=" + idHistorique + ", search=" + search + ", user=" + user + "]";
    }

     */


}

