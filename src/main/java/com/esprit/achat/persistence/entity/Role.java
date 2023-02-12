package com.esprit.achat.persistence.entity;

import com.esprit.achat.persistence.enumeration.ERole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    /*
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    @ToString.Exclude
    @JsonIgnore
    private Set<User> users;*/


}
