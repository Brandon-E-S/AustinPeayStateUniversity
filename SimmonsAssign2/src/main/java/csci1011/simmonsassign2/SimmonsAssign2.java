package csci1011.simmonsassign2;
import java.util.Scanner;

/**
 * CSCI 1010 Assignment 2
 * @author Brandon Simmons
 * Description: A tool to show the amount of calories lost with exercise.
 */
public class SimmonsAssign2 {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    //Calorie variables
    double badmitonCalories = 0.044;
    double runningCalories = 0.087;
    double walkingCalories = 0.036;
    double liftingCalories = 0.042;
    
    //Display welcome message
        System.out.println("Welcome to Brandon Simmons' Workout Calculator!");
        System.out.println("");
        
    //Retrive user's weight
        System.out.println("Please enter your weight: ");
        int weight = keyboard.nextInt();
        if (weight <= 0)
        {
            System.out.println("Invalid weight.");
            return;
        }
        
    //Retrive badmiton minutes
        System.out.println("Please enter the minutes spent playing badmiton: ");
        int badmitonMinutes = keyboard.nextInt();
        if (badmitonMinutes < 0)
        {
            System.out.println("Invalid entry.");
            return;
        }
        
    //Retrieve running minutes
        System.out.println("Please enter the minutes spent running: ");
        int runningMinutes = keyboard.nextInt();
        if (runningMinutes < 0)
        {
            System.out.println("Invalid entry.");
            return;
        }
        
    //Retrive walking minutes
        System.out.println("Please enter the minutes spent walking: ");
        int walkingMinutes = keyboard.nextInt();  
        if (walkingMinutes < 0)
        {
            System.out.println("Invalid entry.");
            return;
        }
        
    //Retrieve weight lifting minutes
        System.out.println("Please enter the minutes spent lifting weights: ");
        int liftingMinutes = keyboard.nextInt();
        if (liftingMinutes < 0)
        {
            System.out.println("Invalid entry.");
            return;
        }
        System.out.println("");
        
    //Calculations for calorie loss
    double badmitonLoss = (weight * badmitonCalories) * badmitonMinutes;
    double runningLoss = (weight * runningCalories) * runningMinutes;
    double walkingLoss = (weight * walkingCalories) * walkingMinutes;    
    double liftingLoss = (weight * liftingCalories) * liftingMinutes;

    //Provide calorie loss per activity
        if (badmitonMinutes != 0)
        {
        System.out.println("You spent " + badmitonMinutes + " minutes playing badmiton and burned " + badmitonLoss + " calories.");
        }
        else {}
        if (runningMinutes != 0)
        {
        System.out.println("You spent " + runningMinutes + " minutes running and burned " + runningLoss + " calories.");
        }
        else{}
        if (walkingMinutes != 0)
        {
        System.out.println("You spent " + walkingMinutes + " minutes walking and burned " + walkingLoss + " calories.");
        }
        else{}
        if (liftingMinutes != 0)
        {
        System.out.println("You spent " + liftingMinutes + " minutes lifting weights and burned " + liftingLoss + " calories.");
        }
        else{}
            
    //Calculations for totals
        int totalHours = (badmitonMinutes + runningMinutes + walkingMinutes + liftingMinutes) / 60;
        int totalMinutes = (badmitonMinutes + runningMinutes + walkingMinutes + liftingMinutes) % 60;
        double totalCalories = badmitonLoss + runningLoss + walkingLoss + liftingLoss;
            
    //Provide total time and calories lost
        System.out.println("You spent " + totalHours + " hours and " + totalMinutes + " minutes working out and burned " + Math.round(totalCalories) + " calories.");
        
        
        
        
        
        
        
        
        
        
    }
}
