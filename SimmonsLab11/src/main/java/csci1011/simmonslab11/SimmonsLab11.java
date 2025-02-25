package csci1011.simmonslab11;
import java.util.Scanner;

/**
 *
 * @author Brandon Simmons
 */
public class SimmonsLab11 {

    public static void main(String[] args) {
        
        Course course = createCourse();
        
        course.readScores();
        
        course.displayInfo();
        
        System.out.printf("The average score is: %.2f%n", course.getAverage());
        System.out.printf("The maximum score is: %.2f%n", course.getMax());
        System.out.printf("The minimum score is: %.2f%n", course.getMin());
        
        
    }
    
    
    public static Course createCourse()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the course code: ");
        String courseCode = keyboard.nextLine();
        
        System.out.println("Enter the course title: ");
        String courseTitle = keyboard.nextLine();
        
        System.out.println("Enter the credit hours: ");
        double creditHours = keyboard.nextDouble();
        
        System.out.println("Enter the number of students in the course: ");
        int numStudents = keyboard.nextInt();
        
        return new Course(courseCode, courseTitle, creditHours, numStudents);
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
