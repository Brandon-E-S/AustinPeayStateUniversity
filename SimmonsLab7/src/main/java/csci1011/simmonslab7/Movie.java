package csci1011.simmonslab7;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 7
 *
 * @author Brandon Simmons Description: The Movie class where all information
 * about the movie is set and read for the main method.
 */
public class Movie {

    private String title;
    private String director;
    private int year;

    /**
     * Get the title from the Movie class.
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the director from the Movie class.
     * @return
     */
    public String getDirector() {
        return this.director;
    }

    /**
     * Get the year from the Movie class.
     * @return
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Used to set new information for the Movie class from main method.
     */
    public void setMovie(String newTitle, String newDirector, int newYear) {
        this.title = newTitle;
        this.director = newDirector;
        this.year = newYear;
    }

    /**
     * Get the movie information from the user and set it in Movie class.
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the title of the movie: ");
        this.title = keyboard.nextLine();

        System.out.println("Enter the director of the movie: ");
        this.director = keyboard.nextLine();

        System.out.println("Enter the year the movie was released: ");
        this.year = keyboard.nextInt();
    }

    /**
     * Write the output of the current Movie class information.
     */
    public void writeOutput() {
        System.out.println(this.title + " dir. " + this.director + " (" + this.year + ")");
    }

}
