package com.my.character.expose.dto;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class CharacterRequest {

    @Column(name = "id_character")
    private Integer idCharacter;
    private String name;
    private String item;
    @Column(name = "class_id")
    private Integer classId;


    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classType) {
        this.classId = classType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
