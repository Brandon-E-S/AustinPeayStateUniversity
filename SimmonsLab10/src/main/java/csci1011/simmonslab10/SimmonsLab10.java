package csci1011.simmonslab10;

/**
 *CSCI 1011 Lab 10
 * @author Brandon Simmons
 * Description: A tool to help find information about a line from different source types.
 */
public class SimmonsLab10 {

    public static void main(String[] args) {
        
        System.out.println("Testing toString Method.");
        testToString(new Line());
        testToString(new Line(2.0,0.0));
        testToString(new Line(0.0,3.0));
        testToString(new Line(2.0,3.0));
        testToString(new Line(2.0,-3.0)); 
        
        System.out.println("Testing Set Method.");
        testSet(new Line(), 3.0, 5.0);
        testSet(new Line(),new Point(2,5), new Point(5,11));
        
    }
    
    //* Testing ToString method.
    public static void testToString(Line newLine)
    {
        System.out.println("The line with the slope " + newLine.getSlope() +
                " and y-intercept " + newLine.getIntercept() + " is " +
                newLine.toString());
    }
    
    //* Testing Set Method.
    public static void testSet(Line newLine, double slope, double intercept)
    {
        newLine.set(slope, intercept);
        testToString(newLine);
    }
    
    //* Testing Set method with different info.
    public static void testSet(Line newLine, Point p1, Point p2)
    {
        newLine.set(p1, p2);
        System.out.print("The line from " + p1);
        System.out.print(" to " + p2);
        System.out.println(" is " + newLine.toString());
    }
    
    
}
