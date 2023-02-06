package Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

public class Historique implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idHistorique;
    private String search;
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


}

