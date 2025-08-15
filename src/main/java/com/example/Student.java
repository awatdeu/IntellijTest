package com.example;

public class Student {

    String name;
    int age;
    int number;
    boolean gesund;


    public Student(String name, int age, int number, boolean gesund) {
        this.gesund = gesund;
        this.name = name;
        this.age = age;
        this.number = number;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", gesund=" + gesund +
                '}';
    }
}