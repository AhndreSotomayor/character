package com.my.character.service.entity;

import javax.persistence.*;

@Entity(name = "class")
public class ClassEntity {

    @Id
    @Column(name = "class_id")
    private Integer classId;
    private String name;

    public Integer getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }
}