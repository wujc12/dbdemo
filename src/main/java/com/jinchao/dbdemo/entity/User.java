package com.jinchao.dbdemo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String classNumber;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String cellPhone;

    @CreationTimestamp
    private Date createTime;

    public User() {
    }

    public User(String name, String email, String cellPhone, String classNumber) {
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
        this.classNumber = classNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
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

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name +
                ", classNumber=" + classNumber + ", email=" + email +
                ", cellPhone=" + cellPhone + "}";
    }
}
