package com.gurps.model;

public class Skill {

    private Long id;
    private String name;
    private String attribute;   // ST, DX, IQ или HT — от какой характеристики считается навык
    private String difficulty;  // Easy, Average, Hard, Very Hard
    private int points;         // потрачено очков на навык

    public Skill() {
    }

    public Skill(String name, String attribute, String difficulty, int points) {
        this.name = name;
        this.attribute = attribute;
        this.difficulty = difficulty;
        this.points = points;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAttribute() { return attribute; }
    public void setAttribute(String attribute) { this.attribute = attribute; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
}