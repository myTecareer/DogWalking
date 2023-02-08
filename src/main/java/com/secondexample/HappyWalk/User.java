package com.secondexample.HappyWalk;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity // This tells Hibernate to make a table out of this class
public class User {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message="User's name cannot be empty.")
    @Size(min=3, max = 250)
    private String name;
    @NotEmpty(message="User's email cannot be empty.")
    @Email(message = "Please input a valid email.")
    private String email;
    @NotEmpty(message="User's password cannot be empty.")
    private String password;
    private boolean terms;
    private boolean sitters;
    private String status;
    private String type;
    private String district;
    private String introduction;
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User(){

    }
    public User(String name){
        this.name = name;

    }


    public boolean isSitters() {
        return sitters;
    }

    public void setSitters(boolean sitters) {
        this.sitters = sitters;
    }
    public boolean isTerms() {
        return terms;
    }

    public void setTerms(boolean terms) {
        this.terms = terms;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", terms=" + terms +
                ", sitters=" + sitters +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", district='" + district + '\'' +
                ", introduction='" + introduction + '\'' +
//                ", postList=" + postList +
                '}';
    }
}
