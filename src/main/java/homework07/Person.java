package homework07;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private List<Hobby> hobbyList = new ArrayList<>();
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age:" + this.age;
    }

    public void printf() {
        System.out.println(this.getClass().getName() + ": " + this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public void addHobby(Hobby hobby) {
        hobbyList.add(hobby);
    }
}