package csci1011.simmonslab7;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 7
 *
 * @author Brandon Simmons Description: Main method that interacts with the
 * Movie class for setting up movie information.
 */
public class SimmonsLab7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Movie myMovie = new Movie();

        myMovie.readInput();
        myMovie.writeOutput();

        System.out.println("Enter a new title: ");
        //myMovie.title = keyboard.nextLine();

        int year = myMovie.getYear();
        String director = myMovie.getDirector();
        String title = keyboard.nextLine();

        myMovie.setMovie(title, director, year);

        myMovie.writeOutput();
    }
}
