package com.company;

public class Fish {
    private String name1; // дельфин
    private String colors; // полосатый дельфин
    private String family; // delphinidae
    private byte age1; // возраст 45 лет
    private float weight1; // масса 4000 кг или 4 тонна


    void setName1(){
        name1 = "Дельфин";
    }
    public String getName1(){
        return name1;
    }
    void setColors(){
        colors = "полосатый дельфин";
    }
    public String getColors(){
        return colors;
    }
    void setFamily(){
        family = "delphinidae";
    }
    public String getFamily(){
        return family;
    }
    void setAge1(){
        age1 = (byte) 45;
    }
    public byte getAge1() {
        return age1;
    }
    void setWeight1(){
        weight1 = 4.000F;
    }
    public double getWeight1() {
        return weight1;
    }
}
