import java.time.Year;
class Person {
    String name;
    int birthYear;

    Person(){
        name = "name unknown";
        birthYear = 2005;
    }
    Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;

    }
    int calculateAge(int birthYear){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }
    void PersonDetails(){
        int age = calculateAge(birthYear);
        System.out.println("hello" + name + "you were born in" + birthYear + "your current age is" + age);
    }

    public class PersonRequirements {
      public static void main(String args[]){
        
          Person person1 = new Person("sincere", 2005);
          Person person2 = new Person("mary", 2000);
          Person person3 = new Person("sera", 2010);
          Person person4 = new Person();
          Person person5 = new Person();

          person1.PersonDetails();
          person2.PersonDetails();
          person3.PersonDetails();
          person4.PersonDetails();
          person5.PersonDetails();
      }
        
    }
}
