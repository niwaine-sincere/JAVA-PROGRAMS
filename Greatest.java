import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    System.out.println("enter x:");
    int x = scanner.nextInt();
    System.out.println("enter z:");
    int z = scanner.nextInt();
    System.out.println("enter y:");
    int y = scanner.nextInt();

    if (x < y && z < y){
        System.out.println("y is the greatest");
    }
    else{
        System.out.println("wrong expression");

    }
 


    //program to display days of the week

    System.out.println("enter an integer between 1 and 7:");
    int days = scanner.nextInt();

    switch (days) {
        case 1:
            System.out.println("monday");
            break;

     case 2:
        System.out.println("tuesday");
        break;

    case 3:
        System.out.println("wednesday");
        break;
     case 4:
        System.out.println("thursday");
        break;
        
     case 5:
        System.out.println("friday");
        break;
        
     case 6:
        System.out.println("saturday");
        break;
     case 7:
        System.out.println("sunday");
        break;      
        
        default:
            break;
    }

    //program to print the sum and average of 5 numbers 
    int[] numbers = new int [5];

    System.out.println("Enter the first five numbers");

    for(int i = 0; i < numbers.length; i ++){
        int num = scanner.nextInt();
        System.out.println("Enter number " + (i+1)+ ":");
          numbers[i] = scanner.nextInt();
    }
    for(int number : numbers){
        int count;
    
        int sum = 0;
        sum += number; 
    }
    System.out.println("sum: " + sum);
  double average = ( sum/numbers.length);
 System.out.println("average: " + average);




 //program that converts between us dollars and euros
    System.out.println("Enter the rate:");
    double rate = scanner.nextDouble();
    System.out.println("Enter the amount in dollars:");
    double dollars = scanner.nextDouble();
    double euros = dollars * rate;
    System.out.println("The amount in euros is: " + euros);




    //program to display a multiplication table
    System.out.println("Enter the number for which you want to display the multiplication table:");
    int num = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }
}
}

