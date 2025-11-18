package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class MemberEntity {
    private Long id;
    private String name;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;

    public MemberEntity() {
    }

    public MemberEntity(Long id, String name, int age, String address, String email, String phoneNumber) {
        id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
