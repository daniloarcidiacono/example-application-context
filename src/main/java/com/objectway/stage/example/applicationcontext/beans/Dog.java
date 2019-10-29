package com.objectway.stage.example.applicationcontext.beans;

import java.util.Objects;

/**
 * Woof!
 */
public class Dog {
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Double.compare(dog.weight, weight) == 0 &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
