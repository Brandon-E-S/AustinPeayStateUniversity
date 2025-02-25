
package csci1011.simmonslab9;

/**
 *CSCI 1011 Lab 9
 * @author Brandon Simmons
 * Description: The Main class for our point, slope, and distance calculator.
 */
public class SimmonsLab9 {

    public static void main(String[] args) {
        
        testGetNumPoints();
        testConstructors();
        testGetNumPoints();
        testGetSlope();
        testGetDistance();
    }
    
    public static void testConstructors()
    {
        System.out.println("Testing default constructior.");
        Point p1 = new Point();
        System.out.println("The point is " + p1.toString());
        System.out.println("Testing two-argument constructor.");
        Point p2 = new Point(3.5,8.1);
        System.out.println("The point is " + p2.toString());
    }
    
    public static void testGetNumPoints()
    {
        System.out.println("Testing getNumPoints method.");
        System.out.println("The number of points creates is " + Point.getNumPoints());
    }
    
    public static void testGetSlope()
    {
        System.out.println("Testing getSlope method.");
        Point p3 = new Point(0,0);
        Point p4 = new Point(4.0,2.0);
        double slope = Point.getSlope(p3, p4);
        System.out.println("The slope of the line from " + p3.toString() + " to " + p4.toString() + " is " + slope);
    }
    
    public static void testGetDistance()
    {
        System.out.println("Testing getDistance method");
        Point p5 = new Point();
        Point p6 = new Point(3,4);
        double distance = Point.getDistance(p5, p6);
        System.out.println("The distance of the line from " + p5.toString() + " to " + p6.toString() + " is " + distance);
        
    }
    
    
}
