import java.util.Scanner;

public class Studentinfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = scanner.nextLine();

        System.out.println("Name: " + name);

        System.out.println("Enter your age");

        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Age: " + age);

        System.out.println("Enter your average mark");

        double averageMark = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Average Mark: " + averageMark);

        scanner.close();

    }

}