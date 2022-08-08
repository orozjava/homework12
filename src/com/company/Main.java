package com.company;

public class Main {

    public static void main(String[] args) {
        Cat();
        Fish();
        Parrot();
        Dog();

    }
    public static void Cat(){
        Cat cat = new Cat();
        cat.setName();
        String name = cat.getName();
        System.out.println("name = " + name);
        cat.setColor();
        String color = cat.getColor();
        System.out.println("color = " + color);
        cat.setBreed();
        String breed = cat.getBreed();
        System.out.println("breed = " + breed);
        cat.setAge();
        byte age = cat.getAge();
        System.out.println("age = " + age);
        cat.setWeight();
        double weght = cat.getWeight();
        System.out.println("weight = " + weght);
    }
    public static void Fish() {
        Fish fish = new Fish();
        fish.setName1();
        String name1 = fish.getName1();
        System.out.println("имя: " + name1);
        fish.setColors();
        String colors = fish.getColors();
        System.out.println("цвет: " + colors);
        fish.setFamily();
        String family = fish.getFamily();
        System.out.println("семейство: " + family);
        fish.setAge1();
        byte age1 = fish.getAge1();
        System.out.println("возраст: " + age1 + " лет:");
        fish.setWeight1();
        float weight1 = (float) fish.getWeight1();
        System.out.println("вес: " + weight1 + " тонна:");
    }
    public static void Parrot() {
        Parrot parrot = new Parrot();
        parrot.setName2();
        String name2 = parrot.getName2();
        System.out.println(name2);
        parrot.setColor2();
        String color2 = parrot.getColor2();
        System.out.println(color2);
        parrot.setAge2();
        String age2 = parrot.getColor2();
        System.out.println(age2 + " лет");
        parrot.setWeight2();
        int weight2 = parrot.getWeight2();
        System.out.println(weight2 + " кг");
    }
    public static void Dog() {
        Dog dog = new Dog();
        dog.setNickName();
        String nickName = dog.getNickName();
        System.out.println(nickName);
        dog.setColor();
        String color = dog.getColor();
        System.out.println(color);
        dog.setTheFamily();
        String theFamily = dog.getTheFamily();
        System.out.println(theFamily);
        dog.setAge();
        short age = dog.getAge();
        System.out.println(age + " лет");
        dog.setTheWeight();
        double theWeight = dog.getTheWeight();
        System.out.println(theWeight + " кг");
    }

}
