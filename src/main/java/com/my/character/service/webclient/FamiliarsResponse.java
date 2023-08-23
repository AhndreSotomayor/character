package com.my.character.service.webclient;

public class FamiliarsResponse {

    private String name;
    private String role;
    private Integer healthpoint;
    private Integer manapoint;
    private Integer attack;
    private Integer defense;
    private Integer luck;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(Integer healthpoint) {
        this.healthpoint = healthpoint;
    }

    public Integer getManapoint() {
        return manapoint;
    }

    public void setManapoint(Integer manapoint) {
        this.manapoint = manapoint;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
