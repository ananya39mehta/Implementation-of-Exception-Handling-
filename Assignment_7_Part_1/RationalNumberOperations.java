package Assignment_7.Assignment_7_Part_1;

import Assignment_7.Assignment_7_Part_1.RationalNumber;

import java.util.Scanner;



public class RationalNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first rational number (in the format numerator/denominator):");
            String[] input1 = scanner.nextLine().split("/");
            int num1 = Integer.parseInt(input1[0]);
            int den1 = Integer.parseInt(input1[1]);
            RationalNumber rational1 = new RationalNumber(num1, den1);

            System.out.println("Enter the second rational number (in the format numerator/denominator):");
            String[] input2 = scanner.nextLine().split("/");
            int num2 = Integer.parseInt(input2[0]);
            int den2 = Integer.parseInt(input2[1]);
            RationalNumber rational2 = new RationalNumber(num2, den2);

            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            System.out.println("Division: " + rational1.divide(rational2));
            System.out.println("Absolute Value of first number: " + rational1.abs());
            System.out.println("Absolute Value of second number: " + rational2.abs());
            System.out.println("Floating Point Value of first number: " + rational1.toDouble());
            System.out.println("Floating Point Value of second number: " + rational2.toDouble());
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
