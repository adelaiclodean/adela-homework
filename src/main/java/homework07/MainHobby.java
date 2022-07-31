package homework07;

import java.util.*;

public class MainHobby {
    public static void main(String[] args) {

        Person person1 = new Person("Adela", 30);
        Person person2 = new Student("Valeria", 21);
        Person person3 = new Unemployed("Natalia", 20);
        Person person4 = new Employee("Ana", 24);

        Map<Person, List<Hobby>> hobbies = new HashMap<>();

        hobbies.put(person1, Arrays.asList(new Hobby("Football", 2, Arrays.asList(new Address("Strada Ciucas"),new Address("Strada Rosu")))));
        System.out.println(hobbies);
        System.out.println(hobbies.get(person1));

        hobbies.put(person2, Arrays.asList(new Hobby("cycling", 4, Arrays.asList(new Address("Strada Ciucas"),new Address("Strada Rosu"))), new Hobby("Football", 2, Arrays.asList(new Address("Strada Ciucas")))));
        System.out.println(hobbies);
        System.out.println(hobbies.get(person2));

        hobbies.put(person3, Arrays.asList(new Hobby("swiming", 3, Arrays.asList(new Address("Strada Bucuresti")))));
        System.out.println(hobbies);
        System.out.println(hobbies.get(person3));

        hobbies.put(person4, Arrays.asList(new Hobby("dancing", 6, Arrays.asList(new Address("Strada Florilor")))));
        System.out.println(hobbies);
        System.out.println(hobbies.get(person4));


    }
}