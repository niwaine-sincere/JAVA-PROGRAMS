public class Student {
    private String name;
    public int age;
    private void display(){
        System.out.println("name" + name+ "\n"+ "Ages:+age");

    }
}
public class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "kwezi";
        s.age = 23;
        s.display();
    }
}
