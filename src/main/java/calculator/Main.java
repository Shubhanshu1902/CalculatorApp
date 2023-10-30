package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Scientific Calculator");
            System.out.println("What would you like to do?");
            System.out.println("1. Enter 1 to compute Addition");
            System.out.println("2. Enter 2 to compute Subtraction");
            System.out.println("3. Enter 3 to compute Multiplication");
            System.out.println("4. Enter 4 to compute Division");
            System.out.println("5. Enter 5 to exit the program");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            Calculator calcObj = new Calculator();

            if (choice >= 5) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else if (choice == 1) {
                System.out.print("Enter the First number: ");
                Double a = sc.nextDouble();
                System.out.print("Enter the Second number: ");
                Double b = sc.nextDouble();
                calcObj.add(a, b);
            } else if (choice == 2) {
                System.out.print("Enter the First number: ");
                Double a = sc.nextDouble();
                System.out.print("Enter the Second number: ");
                Double b = sc.nextDouble();
                calcObj.sub(a, b);

            } else if (choice == 3) {
                System.out.print("Enter the First number: ");
                Double a = sc.nextDouble();
                System.out.print("Enter the Second number: ");
                Double b = sc.nextDouble();
                calcObj.mul(a, b);

            } else {
                System.out.print("Enter the Dividend: ");
                Double a = sc.nextDouble();
                System.out.print("Enter the Divisor: ");
                Double b = sc.nextDouble();
                calcObj.div(a, b);
            }
        }
    }
}
