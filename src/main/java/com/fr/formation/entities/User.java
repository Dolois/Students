package com.fr.formation.entities;

import javax.persistence.*;
import java.time.LocalDate;

// @Table <= specifie le nom de la table mais n'est pas obligatoire
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String firstname;
    
    @Column(nullable = false)
    private String lastname;
    
    @Column(nullable = false)
    private LocalDate birthdate;
    
    @Column(nullable = false)
    private boolean active;

    public User() {
        super();
    }

    public User(String firstname, String lastname, LocalDate birthdate, boolean active) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.active = active;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
