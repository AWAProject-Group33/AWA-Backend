package com.awaprojectgroup33.awabackend.manager;

import javax.persistence.*;

@Entity(name = "Manager")
@Table(
    name = "manager",
    uniqueConstraints = {
        @UniqueConstraint(name = "manager_email_unique", columnNames = "email")
    }
)
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name = "manager_id",
        updatable = false,
        nullable = false
    )
    private long id;

    @Column(
        name = "first_name",
        nullable = false
    )
    private String firstName;

    @Column(
        name = "last_name",
        nullable = false
    )
    private String lastName;

    @Column(
        name = "email",
        nullable = false
    )
    private String email;

    @Column(
        name = "encrypted_password",
        nullable = false,
        length = 1000
    )
    private String password;


    public Manager() { //empty constructor
    }


    public Manager(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }



    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
