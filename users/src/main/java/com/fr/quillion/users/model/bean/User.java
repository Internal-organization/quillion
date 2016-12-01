package com.fr.quillion.users.model.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nixial on 13/11/2016.
 */
@Setter
@Getter
@Entity
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    private int age;

    @OneToMany(mappedBy = "user")
    private List<UserResource> resources;


}