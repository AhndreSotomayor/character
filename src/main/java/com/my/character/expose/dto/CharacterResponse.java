package com.my.character.expose.dto;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class CharacterResponse {


 //   private Integer idCharacter;
    private String name;
   // private String item;
    private String className;
    private LocalDateTime createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}

