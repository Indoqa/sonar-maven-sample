package com.indoqa.sonar.maven.sample.module1;

public class Cat {

    private String breed;
    private String color;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
        this.color = color;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
