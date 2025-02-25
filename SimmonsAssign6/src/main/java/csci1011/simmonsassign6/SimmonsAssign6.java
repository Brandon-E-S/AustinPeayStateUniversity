package csci1011.simmonsassign6;
import java.util.Scanner;
/**
 * CSCI 1010 Assignment 6
 * @author Brandon Simmons
 * Description: An Album Length Calculator that shows
 * the shortest track, longest track, total album length, and average track length.
 */
public class SimmonsAssign6 {
    
public static void trackTime(int totalSeconds)
{
    int minutes = totalSeconds / 60;
    int seconds = totalSeconds % 60;
    System.out.printf("%d:%02d", minutes, seconds);
}

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Welcome to Brandon Simmons' Album Length Calculator!");
        System.out.println("Please enter all track lengths in minutes and seconds separated by a space.");
        
       //Setting up the request for info from the user using an array set to 12 tracks.
        int numTracks = 12;
        int[] trackLengths = new int[numTracks];
        for (int i = 0; i < numTracks; i++)
        {
            System.out.println("Track " + (i + 1) + ": ");
            int minutes = keyboard.nextInt();
            int seconds = keyboard.nextInt();
        trackLengths[i] = minutes * 60 + seconds;
        } 

        
        //Setting up the calculations for the needed info.
        int shortestTrack = trackLengths[0];
        int longestTrack = trackLengths[0];
        int shortestIndex = 0;
        int longestIndex = 0;
        int totalLength = 0;
        
    for (int i = 0; i < numTracks; i++)
    {
        totalLength += trackLengths[i];
        if (trackLengths[i] < shortestTrack)
        {
            shortestTrack = trackLengths[i];
            shortestIndex = i;
        }
        if (trackLengths[i] > longestTrack)
        {
            longestTrack = trackLengths[i];
            longestIndex = i;
        }
    }
        int averageLength = totalLength / numTracks;
        
        //Letting the user know the results.
        System.out.println("The shortest track is #" + (shortestIndex + 1) + " at ");
        trackTime(shortestTrack);
        System.out.println("");
        
        System.out.println("The longest track is #" + (longestIndex + 1) + " at ");
        trackTime(longestTrack);
        System.out.println("");
        
        System.out.println("The total length of the album is: ");
        trackTime(totalLength);
        System.out.println("");
        
        System.out.println("The average length of a track is: ");
        trackTime(averageLength);
        System.out.println("");
        
    
}
}
