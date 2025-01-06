package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bakebay", "Bakebaiuly", "Manager", 27045.78);
        Employee e2 = new Employee("Altynshash", "Ikr", "Engineer", 50000.00);

        Student s1 = new Student("Aziza", "Zhanabil", 2.5);
        Student s2 = new Student("Sake", "Bake", 3.0);

        List<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(s1);
        persons.add(s2);

        Collections.sort(persons);

        printData(persons);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            String type = p instanceof Employee ? "Employee" : "Student";
            System.out.printf("%s: %s earns %.2f tenge%n", type, p, p.getPaymentAmount());
        }
    }
}
