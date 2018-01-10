/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.el_fartouni.swingDB.entity;

/**
 *
 * @author DAMAR ALI El-Fartouni
 */
public class User {

    private String name;

    private String firstName;

    private String email;

    private int id;

    private String role;

    private String password;

    public User() {
    }

    public User(String name, String firstName, String email, int id, String role, String password) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.id = id;
        this.role = role;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getRole() {
        return role;
    }

    public User setRole(String role) {
        this.role = role;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    

}
