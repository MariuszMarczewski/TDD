package com.company;

public class Car {

    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
