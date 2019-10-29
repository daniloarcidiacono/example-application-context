package com.objectway.stage.example.applicationcontext.beans;

import java.util.Objects;

public class PersonWithDog extends Person {
    private Dog dog;

    public PersonWithDog(final Dog dog) {
        this.dog = dog;
    }

    public PersonWithDog(final String name, final String surname, final Dog dog) {
        super(name, surname);
        this.dog = dog;
    }

    public PersonWithDog(final String name, final String surname, final int age, final Dog dog) {
        super(name, surname, age);
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonWithDog that = (PersonWithDog) o;
        return Objects.equals(dog, that.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dog);
    }

    @Override
    public String toString() {
        return "PersonWithDog{" +
                "dog=" + dog +
                "} " + super.toString();
    }
}
