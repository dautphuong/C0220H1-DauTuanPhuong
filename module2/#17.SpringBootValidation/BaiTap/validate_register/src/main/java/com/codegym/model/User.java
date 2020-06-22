package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.Validate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNumber;
    @Min(18)
    private Integer age;
    @Email
    private String email;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


    //custom validate
    @Override
    public void validate(Object target, Errors errors) {
        User user= (User) target;

        if(!user.lastName.contains("a")){
            errors.rejectValue("lastName","user.lastName");
        }

        if(!user.phoneNumber.matches("^$|[0-9]{10}")){
            errors.rejectValue("phoneNumber","user.phoneNumber");
        }

        if(!user.email.matches("^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{2,4})+$")){
            errors.rejectValue("email","user.email");
        }
    }
}
