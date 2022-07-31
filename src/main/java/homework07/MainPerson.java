package homework07;

import java.util.Set;
import java.util.TreeSet;

public class MainPerson {

    public static void main(String[] args) {

        NameCompare pCompare = new NameCompare();
        TreeSet<Person> tree = new TreeSet<>(pCompare);
        tree.add(new Person("Adela", 30));
        tree.add(new Student("Valeria", 21));
        tree.add(new Unemployed("Natalia", 20));
        tree.add(new Employee("Ana", 24));
        tree.add(new Employee("Ana", 24));
        System.out.println(tree);

        AgeCompare ageCompare = new AgeCompare();
        TreeSet<Person> ageTreeSet = new TreeSet<>(ageCompare);
        ageTreeSet.add(new Person("Adela", 30));
        ageTreeSet.add(new Student("Valeria", 21));
        ageTreeSet.add(new Unemployed("Natalia", 20));
        ageTreeSet.add(new Employee("Ana", 24));
        System.out.println(ageTreeSet);

    }
}






