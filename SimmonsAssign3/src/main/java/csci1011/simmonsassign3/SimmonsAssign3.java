package csci1011.simmonsassign3;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 3
 *
 * @author Brandon Simmons Description: A tool to help determine a dogs 'human'
 * age.
 */
public class SimmonsAssign3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String dogName;
        int dogAge;
        int dogWeight;
        char answer = 'Y';
        System.out.println("Welcome to Brandon Simmons' Dog Age Calculator!");
        System.out.println("");
        do {

            System.out.println("Please enter the name of your dog: ");
            dogName = keyboard.next();
            System.out.println("Please enter the actual age of your dog (1-16): ");
            dogAge = keyboard.nextInt();
            if (dogAge >= 1 && dogAge <= 16) {

            } else {
                System.out.println("Error: Age is out of range.");
                System.out.println("Please enter the actual age of your dog (1-16): ");
                dogAge = keyboard.nextInt();
            }
            System.out.println("Please enter your dog's weight in pounds: ");
            dogWeight = keyboard.nextInt();
            if (dogWeight < 1 || dogWeight > 100 && dogAge < 1 || dogAge > 16) {
                System.out.println("Error: Weight must be greater than 0.");
                System.out.println("Please enter your dog's weight in pounds: ");
                dogWeight = keyboard.nextInt();

            } if (dogWeight >= 1 && dogWeight <= 100 && dogAge >= 1 && dogAge <= 16) {
                switch (dogAge) {
                    case 1:
                        System.out.println("");
                        System.out.println(dogName + "'s age in human years is 15.");
                        System.out.println("");
                        break;
                    case 2, 3, 4, 5:
                        int dogHumanAge1 = dogAge * 4 + 16;
                        System.out.println("");
                        System.out.println(dogName + "'s age in human years is " + dogHumanAge1);
                        System.out.println("");
                        break;
                    case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16:
                        switch (dogWeight) {
                            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                                int dogHumanAge2 = dogAge * 4 + 16;
                                System.out.println("");
                                System.out.println(dogName + "'s age in human years is " + dogHumanAge2);
                                System.out.println("");
                                break;
                            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50:
                                double dogHumanAge3 = dogAge * 4.5 + 15;
                                System.out.println("");
                                System.out.println(dogName + "'s age in human years is " + dogHumanAge3);
                                System.out.println("");
                                break;
                            case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                                double dogHumanAge4 = dogAge * 7.5;
                                System.out.println("");
                                System.out.println(dogName + "'s age in human years is " + dogHumanAge4);
                                System.out.println("");
                                break;
                        }
                        break;
                }
                
            }

            System.out.println("Would you like to calculate the age of another dog? (Y/N): ");
            answer = keyboard.next().charAt(0);
        } while (answer == 'Y');
        do {
            System.out.println("Error: Invalid Choice.");
            System.out.println("Would you like to calculate the age of another dog? (Y/N): ");
            answer = keyboard.next().charAt(0);
            break;
            
        } while (answer != 'Y' && answer != 'N');
        
        do {
            System.out.println("");
            System.out.println("Thank you for using the dog age calculator!");
           return;
        } while (answer == 'N');
        
        
    }
}
