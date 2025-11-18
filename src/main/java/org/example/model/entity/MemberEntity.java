package org.example.model.entity;

import jakarta.persistence.Entity;

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
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
