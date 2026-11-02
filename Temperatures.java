import java.util.Scanner;
   public class Temperatures{
public static void main(String[]args){
    double cel;
    double far;
Scanner scanner =new Scanner(System.in);
 System.out.println("Enter the degree in far");
     far = scanner.nextDouble();
     cel = (far-32)*5/9;

System.out.println(far+ "degree far is equal to" + cel +"in cel");

     scanner.close();

 
}
  }
