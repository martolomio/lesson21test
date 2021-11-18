package com.example.magazine.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "password")
    private String password;
    private String passwordConfirm;

    public User() {
    }

    public User(User user) {
        this.id = user.id;
        this.email = user.email;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.role = user.role;
        this.password = user.password;
    }
    public User(String email, String firstName, String lastName,UserRole role,String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.password = password;
    }

    public User(Integer id,String email, String firstName, String lastName,UserRole role,String password) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && role == user.role && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, role, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", password='" + password + '\'' +
                '}';
    }
}
