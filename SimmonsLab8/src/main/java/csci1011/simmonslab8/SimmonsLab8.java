package csci1011.simmonslab8;

/**
 * CSCI 1011 Lab 8
 *
 * @author Brandon Simmons Description: A tool to help determine if customers
 * are the same or different.
 */
public class SimmonsLab8 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.readInput();
        customer1.writeOutput();

        customer2.readInput();
        customer2.writeOutput();

        customer2 = customer1;

        if (customer1 == customer2) {
            System.out.println("Customer 1 is equal to Customer 2 using the == method.");
        } else {
            System.out.println("Customer 1 is NOT equal to Customer 2 using the == method.");
        }

        if (customer1.equals(customer2)) {
            System.out.println("Customer 1 is equal to Customer 2 using the .equals method.");
        } else {
            System.out.println("Customer 1 is NOT equal to Customer 2 using the .equals method.");
        }

        customer2.setEmail("nobody@nowhere.com");

        customer1.writeOutput();
        customer2.writeOutput();
    }
}
