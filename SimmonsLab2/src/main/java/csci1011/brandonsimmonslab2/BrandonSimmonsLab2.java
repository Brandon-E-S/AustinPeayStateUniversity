package csci1011.brandonsimmonslab2;
import java.util.Scanner;
/**
* CSCI 1011 Lab 2
* @author Brandon Simmons
* A program that calculates interest on a deposit.
*/

public class BrandonSimmonsLab2 {
    
public static double APR = .055;

public static void main(String[] args) {
double percent = APR * 100;
    
Scanner keyboard = new Scanner(System.in);
System.out.println("Welcome to Brandon Simmons's interest calculator.");
System.out.println();
System.out.println("Please enter your initial deposit amount:");
double balance = keyboard.nextDouble();

balance = balance + (balance * APR);

System.out.println("With a " + percent + "% APR your deposit will be worth $" + balance + " in one year.");

balance = balance + (balance * APR);

System.out.println("With a " + percent + "% APR your deposit will be worth $" + balance + " in two years.");
}
}