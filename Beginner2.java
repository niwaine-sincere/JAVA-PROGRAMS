import java.util.Scanner;
public class Beginner2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name:");

String name = scanner.nextLine();

System.out.printf("%s",name);

System.out.println();

System.out.println("Enter your age:");

int age = scanner.nextInt();

System.out.printf("%d",age);

System.out.println();

System.out.println("Enter your Date Of Birth");

int date = scanner.nextInt();

System.out.printf("%d", date);

System.out.println();


System.out.printf("Enter your salary");

double d = scanner.nextDouble();

System.out.println();


}

}