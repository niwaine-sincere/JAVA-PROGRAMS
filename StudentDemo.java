class Student {
    
    String name;
    int age;
    double fees;
}
public class StudentDemo{
    public static void main(String[] args) {
//creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();


        //assigning values to objects
        s1.name = "Alice";
        s1.age = 20;
        s1.fees = 5000000;

        s2.name = "Bob";
        s2.age = 22;
        s2.fees = 5500000;

        s3.name = "Charlie";
        s3.age = 21;
        s3.fees = 5200000;

        //printing values to verify
        System.out.println( s1.name + " " + s1.age + " " + s1.fees);
        System.out.println( s2.name + " " + s2.age + " " + s2.fees);
        System.out.println( s3.name + " " + s3.age + " " + s3.fees);

    }
}