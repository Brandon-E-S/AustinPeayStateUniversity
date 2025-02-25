package csci1011.simmonslab5;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 5
 *
 * @author Brandon Simmons Description: Create a tool for solving simple math
 * problems.
 */
public class SimmonsLab5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Variables
        int choice;

        do {
            // Menu
            System.out.println("Choose one of the following options: ");
            System.out.println("1. Perform an arithmetic operation.");
            System.out.println("2. Apply a function.");
            System.out.println("3. Calculate a factorial.");
            System.out.println("4. Exit the program.");
            System.out.println("");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    //System.out.println("Perform an arithmetic operation.");
                    //Get expression from user
                    System.out.println("Enter your expression in the");
                    System.out.println("form of NUM OP NUM:");
                    System.out.println("");
                    int num1 = keyboard.nextInt();
                    String OPString = keyboard.next();
                    int num2 = keyboard.nextInt();
                    char OPChar = OPString.charAt(0);

                    switch (OPChar) {
                        case '+':
                            System.out.println("Results: " + (num1 + num2));
                            System.out.println("");
                            break;

                        case '-':
                            System.out.println("Results: " + (num1 - num2));
                            System.out.println("");
                            break;

                        case '*':
                            System.out.println("Results: " + (num1 * num2));
                            System.out.println("");
                            break;

                        case '/':
                            System.out.println("Results: " + (num1 / num2));
                            System.out.println("");
                            break;

                        case '%':
                            System.out.println("Results: " + (num1 % num2));
                            System.out.println("");
                            break;

                        default:
                            System.out.println("Unknown Operator.");
                            System.out.println("");
                    }
                    break;

                case 2:
                    //System.out.println("Apply a function.");
                    System.out.println("Enter an expression in the");
                    System.out.println("form of FUNC ARG:");
                    String function = keyboard.next();
                    double arg = keyboard.nextDouble();

                    switch (function.toLowerCase()) {
                        case "sqrt":
                            System.out.println("Results: " + Math.sqrt(arg));
                            System.out.println("");
                            break;
                        case "log":
                            System.out.println("Results: " + Math.log10(arg));
                            System.out.println("");
                            break;
                        case "ln":
                            System.out.println("Results: " + Math.log(arg));
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Unknown Function: " + function);

                    }

                    break;

                case 3:
                    // System.out.println("Calculate a factorial.");
                    System.out.println("Enter a number: ");
                    System.out.println("");
                    int userFactorial = keyboard.nextInt();
                    int factorialResult = 1;

                    while (userFactorial > 1) {
                        factorialResult = factorialResult * userFactorial;
                        userFactorial--;
                    }

                    System.out.println("Results: " + factorialResult);
                    System.out.println("");

                    break;

                case 4:
                    System.out.println("Thank you for using Brandon Simmons' calculator.");
                    System.out.println("");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice: " + choice);
                    System.out.println("");

            }
        } while (choice != 4);

    }
}
