package csc372module5;

import java.util.Scanner;

public class ProductRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!input.hasNextDouble()) {
                System.out.println("Don't work. Please enter a number.");
                input.next();
                System.out.print("Number " + (i + 1) + ": ");
            }
            numbers[i] = input.nextDouble();
        }

        double result = calculateProduct(numbers, 0);

        System.out.println("The product of the five numbers is: " + result);

        input.close();
    }

    public static double calculateProduct(double[] numbers, int index) {
        // Base case: all five numbers have been processed
        if (index == numbers.length) {
            return 1.0;
        }

        // Recursive case: multiply the current number by the remaining product
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}