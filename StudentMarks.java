class Student {
    String RegNo;
    String Name;
    int JavaMark;
    int MultimediaMark;

    // Void method
    void CalculateTotal() {
        int total = JavaMark + MultimediaMark;

        System.out.println("Total Marks: " + total);
    }
}

public class StudentMarks
 {
    public static void main(String[] args) {

        // Create object
        Student student = new Student();

        // Assign values
        student.RegNo = "BIS/23/001";
        student.Name = "John";
        student.JavaMark = 75;
        student.MultimediaMark = 80;

        // Display student information
        System.out.println("Registration Number: " + student.RegNo);
        System.out.println("Name: " + student.Name);
        System.out.println("Java Mark: " + student.JavaMark);
        System.out.println("Multimedia Mark: " + student.MultimediaMark);

        // Call void method
        student.CalculateTotal();
    }
}