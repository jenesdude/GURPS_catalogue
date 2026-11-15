package com.gurps.model;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private Long id;
    private String name;
    private int strength;      // ST
    private int dexterity;     // DX
    private int intelligence;  // IQ
    private int health;        // HT
    private int pointsTotal;   // общий бюджет очков
    private int pointsSpent;   // потрачено очков
    private List<Trait> traits = new ArrayList<>();
    private List<Skill> skills = new ArrayList<>();

    // Конструкторы
    public Character() {
    }

    public Character(String name, int strength, int dexterity,
                     int intelligence, int health) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.health = health;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getDexterity() { return dexterity; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getPointsTotal() { return pointsTotal; }
    public void setPointsTotal(int pointsTotal) { this.pointsTotal = pointsTotal; }

    public int getPointsSpent() { return pointsSpent; }
    public void setPointsSpent(int pointsSpent) { this.pointsSpent = pointsSpent; }

    public List<Trait> getTraits() { return traits; }
    public void setTraits(List<Trait> traits) { this.traits = traits; }

    public List<Skill> getSkills() { return skills; }
    public void setSkills(List<Skill> skills) { this.skills = skills; }
}

