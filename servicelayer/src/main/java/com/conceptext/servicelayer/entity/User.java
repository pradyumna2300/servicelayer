package com.conceptext.servicelayer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//for getter and setter method add lombok anotation
@AllArgsConstructor//lombok anno
@NoArgsConstructor
@Entity//to create the table
@Table(name = "user_concept")//for the table name
public class User {
    @Id//for id to be primary key
    //below annotation to auto increment the id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String mobile;

    private String address;

    private String password;
    private String gender;
}
