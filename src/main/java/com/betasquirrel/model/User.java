package com.betasquirrel.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;


@Entity
@Table(name = "users",  schema = "demo")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "userID")
    private Integer id;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    @Email(message = "Invalid password")
    private String email;

    @Column(name = "Address_addressID")
    private String mobile;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
