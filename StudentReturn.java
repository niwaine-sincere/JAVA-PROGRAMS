class Student {
    String RegNo;
    String Name;
    int JavaMark;
    int MultimediaMark;

    // Method returns an integer
    int CalculateTotal() {
        return JavaMark + MultimediaMark;
    }
}

public class StudentReturn {
    public static void main(String[] args) {

        Student student = new Student();

        student.RegNo = "BIS/23/002";
        student.Name = "Mary";
        student.JavaMark = 85;
        student.MultimediaMark = 90;

        System.out.println("Registration Number: " + student.RegNo);
        System.out.println("Name: " + student.Name);
        System.out.println("Java Mark: " + student.JavaMark);
        System.out.println("Multimedia Mark: " + student.MultimediaMark);

        // Store returned value
        int total = student.CalculateTotal();

        System.out.println("Total Marks: " + total);
    }
}