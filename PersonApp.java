import java.time.Year;

class Person {

    String name;
    int birthYear;

    // Parameterless constructor
    Person() {
        name = "Unknown";
        birthYear = 2000;
    }

    // Parameterized constructor
    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Calculate age
    int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();

        return currentYear - birthYear;
    }

    // Display details
    void personDetails() {

        int age = calculateAge(birthYear);

        System.out.println(
            "Hello " + name +
            ", you were born in " + birthYear +
            " and your current age is " + age
        );
    }
}

public class PersonApp {

    public static void main(String[] args) {

        // Three parameterized objects
        Person person1 = new Person("Joan", 1987);
        Person person2 = new Person("Brian", 2000);
        Person person3 = new Person("Sarah", 1998);

        // Two parameterless objects
        Person person4 = new Person();
        Person person5 = new Person();

        // Display information
        person1.personDetails();
        person2.personDetails();
        person3.personDetails();
        person4.personDetails();
        person5.personDetails();
    }
}