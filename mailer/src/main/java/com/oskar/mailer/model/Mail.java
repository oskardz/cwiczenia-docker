package com.oskar.mailer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@Entity
@Table(name = "maile")
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Email
    String email;
    String msg;


    public Mail(@Email String email, String msg) {
        this.email = email;
        this.msg = msg;
    }
}
