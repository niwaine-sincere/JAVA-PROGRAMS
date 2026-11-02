 class Student {
   String RegNo; 
   String Name;
   int JavaMark;
   int MultimediaMark;

void CalculateTotal() {
 int total = JavaMark + MultimediaMark;
 System.out.println("Total Marks:"+""+total);

}

public class StudentMain{
public static void main(String[] args) {


    Student student = new Student();


        student.RegNo = "25/U/10793";
        student.Name = "Sincere";
        student.JavaMark = 82;
        student.MultimediaMark = 78;

        System.out.println("RegNo:"+student.RegNo);
        System.out.println("Name:"+student.Name);
        System.out.println("JavaMark:"+student.JavaMark);
        System.out.println("MultimediaMark:"+student.MultimediaMark);

        student.CalculateTotal();

    }
}}