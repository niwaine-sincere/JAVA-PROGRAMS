class Student {
    String RegNo;
    String Name;
    int JavaMark;
    int MultimediaMark;

    // Method with parameters
    int CalculateTotal(int JavaMark, int MultimediaMark) {
        return JavaMark + MultimediaMark;
    }
}

public class StudentParameters {
    public static void main(String[] args) {

        Student student = new Student();

        student.RegNo = "BIS/23/003";
        student.Name = "Peter";
        student.JavaMark = 70;
        student.MultimediaMark = 85;

        System.out.println("Registration Number: " + student.RegNo);
        System.out.println("Name: " + student.Name);
        System.out.println("Java Mark: " + student.JavaMark);
        System.out.println("Multimedia Mark: " + student.MultimediaMark);

        int total = student.CalculateTotal(
            student.JavaMark,
            student.MultimediaMark
        );

        System.out.println("Total Marks: " + total);
    }
}