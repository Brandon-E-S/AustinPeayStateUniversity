package csci1011.simmonslab11;
import java.util.Scanner;
/**
 *
 * @author Brandon Simmons
 */
public class Course {
    
    //Private variables
    private String courseCode;
    private String courseTitle;
    private double creditHours;
    private double[] scores;
    
    public Course(String courseCode, String courseTitle, double creditHours, int numStudents)
    {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.scores = new double[numStudents];
    }
    
    public void readScores()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter scores for " + scores.length + " students:");
        
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("Score " + (i + 1) + ": ");
            scores[i] = keyboard.nextDouble();
        }
    }
    
    public void displayInfo()
    {
        System.out.println(courseCode + ": " + courseTitle + " (" + creditHours + " credit hours)");
        System.out.println("Class size: " + scores.length);
        System.out.println("Scores: ");
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }
    }
    
    private double calculateSum()
    {
        double sum = 0;
        
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }
        return sum;
    }
    
    public double getAverage()
    {
        return calculateSum() / scores.length;
    }
    
    public double getMax()
    {
        double max = scores[0];
        double score = 0;
        
        for (int i = 0; i < scores.length; i++)
        {
            score = scores[i];
            if (score > max)
            {
                max = score;
            }
        }
        return max;
    }
    
    public double getMin()
    {
        double min = scores[0];
        double score = 0;
        
        for (int i = 0; i < scores.length; i++)
        {
            score = scores[i];
            if (score < min)
            {
                min = score;
            }
        }
        return min;
    }
    
}
