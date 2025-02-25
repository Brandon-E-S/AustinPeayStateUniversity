package csci1011.simmonslab8;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 8
 *
 * @author Brandon Simmons Description: Customer Class for Lab 8.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the customer first name: ");
        this.firstName = keyboard.nextLine();

        System.out.println("Enter the customer last name: ");
        this.lastName = keyboard.nextLine();

        System.out.println("Enter the customer email address: ");
        this.email = keyboard.nextLine();
    }

    public void writeOutput() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Email: " + this.email);
    }

    private boolean hasSameNameAs(Customer newCustomer) {
        return this.firstName.equals(newCustomer.getFirstName())
                && this.lastName.equals(newCustomer.getLastName());
    }

    private boolean hasSameEmailAs(Customer newCustomer) {
        return this.email.equals(newCustomer.getEmail());
    }

    public boolean equals(Customer newCustomer) {
        return this.hasSameNameAs(newCustomer) && this.hasSameEmailAs(newCustomer);
    }

}