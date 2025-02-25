package csci1011.simmonslab3;
import java.util.Scanner;

/**
 * CSCI 1011 Lab 3
 * @author Brandon Simmons
 * Description: Trying different String Methods and outputting them.
 */
public class SimmonsLab3 {

    public static void main(String[] args) {
        
        //User Input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the course code:");
        String courseCode = keyboard.nextLine();
        System.out.println(""); //Add a blank line
        
        System.out.println("Enter the course title: ");
        String courseTitle = keyboard.nextLine();
        System.out.println(""); //Add a blank line
        
        //Default Constants
        //String courseCode = "CSCI 1011";
        //String courseTitle = "Introduction to Programming I Lab";
        
        //+ Operator
        String welcomeMessage = "Welcome to " + courseCode + ": " + courseTitle + "!";
        
        //Output
        System.out.println("Testing + Operator");
        System.out.println(welcomeMessage);
        System.out.println(""); //Add a blank line
        
        //Output Lowercase
        System.out.println("Testing toLowerCase Method");
        System.out.println(welcomeMessage.toLowerCase());
        System.out.println(""); //Add a blank line
        
        //Output Uppercase
        System.out.println("Testing toUpperCase Method");
        System.out.println(welcomeMessage.toUpperCase());
        System.out.println("");//Add a blank line
        
        //Find String Length
        System.out.println("Testing Length Method");
        System.out.println(welcomeMessage.length());
        System.out.println(""); //Add a blank line
        
        String welcomeMessage2 = welcomeMessage.toUpperCase();
        
        //Output Equals Method
        System.out.println("Testing Equal Method");
        boolean messageEqual = welcomeMessage.equals(welcomeMessage2);
        System.out.println("Messages are equal: " + messageEqual);
        System.out.println(""); //Add a blank line
        
        //Output Ingore Case Method
        System.out.println("Testing equalsIgnoreCase Method");
        boolean messageEqualIgnoreCase = welcomeMessage.equalsIgnoreCase(welcomeMessage2);
        System.out.println("Messages are equal ignoring case: " + messageEqualIgnoreCase);
        System.out.println(""); //Add a blank line
        
        //Output Replace Method
        System.out.println("Testing Replace Method");
        welcomeMessage = welcomeMessage.replace("1011", "1010");
        System.out.println(welcomeMessage);
        System.out.println(""); //Add a blank line
        
        //Output Index, Substring, and Concat Methods
        System.out.println("Testing indexOf, Substring, and Concat Method");
        int messageIndex = welcomeMessage.indexOf("Introduction");
        welcomeMessage = welcomeMessage.substring(0,messageIndex);
        welcomeMessage = welcomeMessage.concat("Introduction to Programming!");
        System.out.println(welcomeMessage);
    }
}
