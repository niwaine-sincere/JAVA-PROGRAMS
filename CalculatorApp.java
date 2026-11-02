import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean running = true;

        System.out.println("----- Simple Calculator -----");

        while (running) {
            System.out.println();
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            System.out.print("Choose an operation: ");

            if (!input.hasNextInt()) {
                if (!input.hasNext()) {
                    break; // no more input
                }
                System.out.println("Invalid choice. Please enter a number from the menu.");
                input.next(); // discard the bad input
                continue;
            }

            int choice = input.nextInt();

            if (choice == 0) {
                running = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please enter a number from the menu.");
                continue;
            }

            System.out.print("Enter the first number: ");
            if (!input.hasNextDouble()) {
                System.out.println("That is not a valid number.");
                input.next();
                continue;
            }
            double first = input.nextDouble();

            System.out.print("Enter the second number: ");
            if (!input.hasNextDouble()) {
                System.out.println("That is not a valid number.");
                input.next();
                continue;
            }
            double second = input.nextDouble();

            try {
                double result;
                switch (choice) {
                    case 1:
                        result = calculator.add(first, second);
                        break;
                    case 2:
                        result = calculator.subtract(first, second);
                        break;
                    case 3:
                        result = calculator.multiply(first, second);
                        break;
                    case 4:
                        result = calculator.divide(first, second);
                        break;
                    default:
                        result = calculator.modulus(first, second);

                        break;
                }
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Guudu Bayi. I goingi ...");
        input.close();
    }
}

