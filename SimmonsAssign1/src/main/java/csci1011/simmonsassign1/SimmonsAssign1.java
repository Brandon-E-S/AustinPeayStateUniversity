package csci1011.simmonsassign1;
import java.util.Scanner;
        
/**
 * CSCI 1010 Assignment 1
 * @author Brandon Simmons
 * Description: A geometry calculator to calculate the area and perimeter of different shapes.
 */
public class SimmonsAssign1 {


    
    public static void main(String[] args) {
        
       
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Brandon's geometry calculator!");
        
        System.out.println("Enter the square's side: "); // Square calculation.
        double SquareSide = keyboard.nextDouble(); // Side input.
        
        double SquareArea = SquareSide * SquareSide; // Area calculation.        
        double SquarePerimeter = SquareSide * 4; // Perimeter calculation.
        
        System.out.println("Square Area: " + SquareArea);
        System.out.println("Square Perimeter: " + SquarePerimeter);
        
        System.out.println("Enter the rectangle's length: "); // Rectangle calculation.
        double RecLength = keyboard.nextDouble(); // Length input.
        System.out.println("Enter the rectangle's width: "); // Rectangle calculation.
        double RecWidth = keyboard.nextDouble(); // Width input.
        
        double RecArea = RecLength * RecWidth; // Area calculation.        
        double RecPerimeter = (RecLength + RecWidth) * 2; // Perimeter calculation.
        
        System.out.println("Rectangle Area: " + RecArea);
        System.out.println("Rectangle Perimeter: " + RecPerimeter);
        
        System.out.println("Enter the triangle's base: "); // Triangle calculation.
        double TriBase = keyboard.nextDouble(); // Base input.
        System.out.println("Enter the triangle's height: "); // Triangle calculation.
        double TriHeight = keyboard.nextDouble(); // Height input.
        
        double TriArea = (TriBase * TriHeight) / 2; // Area calculation.        
        
        System.out.println("Triangle Area: " + TriArea);
        
        
    }
}
