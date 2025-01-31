package com.springDingDong.minji.week2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int age;

    public Member() {}

    public Member(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
