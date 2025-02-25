package csci1011.simmonsassign4;

import java.util.Scanner;

/**
 * CSCI 1011 Assign 4
 *
 * @author Brandon Simmons
 * Description: Determine the physics behind a ball launch.
 */
public class SimmonsAssign4 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
    

    System.out.println ("Welcome to Brandon's Ball Physics Calculator!");
    System.out.println ("Please enter the following information about your ball launch:");
    System.out.println ("Launch Angle (in degrees): ");
        double angle  = keyboard.nextDouble();
    
    System.out.println("Initial Velocity (in meters/second): ");
        double velocity = keyboard.nextDouble();
        
        System.out.println("Initial Height (in meters): ");
        double height = keyboard.nextDouble();
        
        System.out.println("Time Interval (in seconds): ");
        double time = keyboard.nextDouble();
        
        Ball newBall = new Ball();
        
        newBall.initialize(angle, velocity, height);
        
        newBall.update(time);
        
        System.out.println("The ball has traveled " + newBall.getHDist() + " meters.");
        
        

}
}
