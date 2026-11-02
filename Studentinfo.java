import java.util.Scanner;

public class Studentinfo{

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Enter your name");
	
	String name = scanner.nextLine();

	System.out.println(name);

	

	System.out.println("Enter your age");

	int age = scanner.nextInt();
 
        System.out.println(age);


	System.out.println("Enter your average mark");

	double averageMark = scanner.nextDouble();

	System.out.println(averageMark);
	

}

}
