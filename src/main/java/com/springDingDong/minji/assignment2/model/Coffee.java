package com.springDingDong.minji.assignment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int shot;
    private boolean ice;
    private String size;

    public Coffee(String name, int shot, String size, boolean ice) {
        this.name = name;
        this.shot = shot;
        this.size = size;
        this.ice = ice;
    }
}
