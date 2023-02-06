package com.esprit.achat.persistence.entity;

import com.esprit.achat.persistence.enumeration.ERole;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


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


}
