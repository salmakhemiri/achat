package Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class Reaction implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idReaction;
    private String react;
    @ManyToOne
    private Commentaire commentaire;
    @ManyToOne
    private User user;

    public Reaction() {
        super();
    }


    public Reaction(String react, Commentaire commentaire, User user) {
        super();
        this.react = react;
        this.commentaire = commentaire;
        this.user = user;
    }


    public Long getIdReaction() {
        return idReaction;
    }


    public void setIdReaction(Long idReaction) {
        this.idReaction = idReaction;
    }


    public String getReact() {
        return react;
    }
    public void setReact(String react) {
        this.react = react;
    }

    public Commentaire getComment() {
        return commentaire;
    }

    public void setComment(Commentaire commentaire) {
        this.commentaire = commentaire;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Reaction [idReaction=" + idReaction + ", react=" + react + ", comment=" + commentaire + ", user=" + user
                + "]";
    }



}