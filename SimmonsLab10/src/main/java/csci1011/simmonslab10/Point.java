
package csci1011.simmonslab10;

/**
 *CSCI 1011 Lab 9
 * @author Brandon Simmons
 * Description: Point class for figuring out all the information for a point.
 */
public class Point {
    private double xcord;
    private double ycord;
    private static int numPoints = 0;
    
    //* Initialize the Point.
    public Point()
    {
      initPoint(0,0);
    }
    
    //* Initialize a new point.
    public Point(double newXcord, double newYcord)
    {
        initPoint(newXcord,newYcord);
    }
    
    //* Initialize method that increases numPoints as well.
    private void initPoint(double newXcord, double newYcord)
    {
        this.xcord = newXcord;
        this.ycord = newYcord;
        numPoints++;
    }
    
    //Accessor Methods
    //* Get X Coordinate.
    public double getXcord()
    {
        return this.xcord;
    }
    
    //* Get Y Coordinate.
    public double getYcord()
            {
                return this.ycord;
            }
    
    //* Get the number of points generated up to this point.
    public static int getNumPoints()
    {
        return numPoints;
    }
    
    //* Get slope from two points.
   public static double getSlope(Point p1, Point p2)
   {
       double xDiff = p1.xcord - p2.xcord;
       double yDiff = p1.ycord - p2.ycord;
       return yDiff / xDiff;
   }
   
   //* Get distance of the line from two points.
   public static double getDistance(Point p1, Point p2)
   {
      double xDiff = p1.xcord - p2.xcord;
      double yDiff = p1.ycord - p2.ycord; 
      return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
      
   }
    
   //* Convert the point to a String.
    public String toString()
    {
        String cord = "(" + this.xcord + ", " + this.ycord + ")";
        return cord;
    }
    
    
    
    
    
    
    
    
    
    
}
