package com.company;

public class Cat {
    private String name;
    private String color;
    private String breed;
    private byte age;
    private double weight;


    void setName(){
        name = "Pepa";
    }
    String getName () {
        return name;
    }
    void setColor(){
        color = "black";
    }
    String getColor () {
        return color;
    }

    void setBreed(){
        breed = "bombay cat";
    }

    String getBreed () {
        return breed;
    }

    void setAge(){
        age = (byte) 15;
    }

    byte getAge () {
        return age;
    }

    void setWeight(){
        weight = 4.4;
    }

    double getWeight () {
        return weight;
    }
}
