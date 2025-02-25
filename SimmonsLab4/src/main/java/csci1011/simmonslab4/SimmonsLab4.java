package csci1011.simmonslab4;
import java.util.Scanner;

/**
 *CSCI 1011 Lab 4
 * @author Brandon Simmons
 * Description: A tool for use for students to know if their professor is available for office hours.
 */
public class SimmonsLab4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //Variables
        String dayOfWeek;
        String timeOfDay;
        
        //Get Day of Week from user.
        System.out.println("Enter the day of the week: ");
        dayOfWeek = keyboard.nextLine();
        if (!(dayOfWeek.equalsIgnoreCase("mon") || dayOfWeek.equalsIgnoreCase("monday") ||
             dayOfWeek.equalsIgnoreCase("tue") || dayOfWeek.equalsIgnoreCase("tuesday") ||
             dayOfWeek.equalsIgnoreCase("wed") || dayOfWeek.equalsIgnoreCase("wednesday") ||
             dayOfWeek.equalsIgnoreCase("thu") || dayOfWeek.equalsIgnoreCase("thursday") ||
             dayOfWeek.equalsIgnoreCase("fri") || dayOfWeek.equalsIgnoreCase("friday")))
        {
            System.out.println("Invalid Day of the Week.");
            return;
        }
        
        //Get Time of Day from user.
        System.out.println("Enter a time (XX:XXam/pm): ");
        timeOfDay = keyboard.nextLine();
        
        //Get length of string
        int length = timeOfDay.length();
        int colonIndex = timeOfDay.indexOf(":");
        
        //Get the hours from the string
        String hourString = timeOfDay.substring(0,colonIndex);
        int hour = Integer.parseInt(hourString);
        
        //Get the minutes from the string
        String minuteString = timeOfDay.substring(colonIndex + 1, colonIndex + 3);
        int minute = Integer.parseInt(minuteString);
        
        //Get the am/pm from the string
        String timeSuffix = timeOfDay.substring(length - 2);
        
        //Verify Time
        if (hour <= 0 || hour >= 13)
        {
            System.out.println("Invalid Time.");
            return;
        }
        if (minute < 0 || minute >= 60)
        {
            System.out.println("Invalid Time.");
            return;
        }
        if (!(timeSuffix.equalsIgnoreCase("am") || timeSuffix.equalsIgnoreCase("pm")))
        {
            System.out.println("Invalid Time.");
            return;
        }
        
        //Case for Monday from 3:00 - 5:00pm 
        if (dayOfWeek.equalsIgnoreCase("Mon") || dayOfWeek.equalsIgnoreCase("Monday"))
        {
            System.out.println("Day of the week: Monday");
            if (timeSuffix.equalsIgnoreCase("AM"))
            {
                System.out.println("Not Available.");
            }
            else if (hour >= 3 && hour <=4)
            {
                System.out.println("Available.");
            }
            else
            {
                System.out.println("Not Available.");
            }
        }
        
        //Case for Thursday
        else if (dayOfWeek.equalsIgnoreCase("Thu") || dayOfWeek.equalsIgnoreCase("Thursday"))
        {
            System.out.println("Day of the Week: Thursday");
            if(timeSuffix.equalsIgnoreCase("AM"))
            {
                System.out.println("Not Available.");
            }
            else if ((hour >= 3 && minute >= 30) && (hour <=4))
            {
                System.out.println("Available.");
            }
            else
            {
                System.out.println("Not Available.");
            }
        }
        
        //Case for Friday
        else if (dayOfWeek.equalsIgnoreCase("Fri") || dayOfWeek.equalsIgnoreCase("Friday"))
        {
            System.out.println("Day of the Week: Friday");
            if(timeSuffix.equalsIgnoreCase("AM"))
            {
                System.out.println("Not Available.");
            }
            else if ((hour >= 3) && (hour <=4 && minute <= 29))
            {
                System.out.println("Available.");
            }
            else
            {
                System.out.println("Not Available.");
            }
        }
        
        //Case for Not Available days
        else if (dayOfWeek.equalsIgnoreCase("Tue") || dayOfWeek.equalsIgnoreCase("Tuesday")
                || dayOfWeek.equalsIgnoreCase("Wed") || dayOfWeek.equalsIgnoreCase("Wednesday")
                || dayOfWeek.equalsIgnoreCase("Sat") || dayOfWeek.equalsIgnoreCase("Saturday")
                || dayOfWeek.equalsIgnoreCase("Sun") || dayOfWeek.equalsIgnoreCase("Sunday"))
        {
            System.out.println("Day of the Week: " + dayOfWeek);
            System.out.println("Not Available.");
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
