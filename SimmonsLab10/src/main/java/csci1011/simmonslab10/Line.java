package csci1011.simmonslab10;

/**
 *
 * @author Brandon Simmons
 */
public class Line {
    
   private double slope;
   private double intercept;
   
   //* Set up a line object. 
   public Line()
   {
       set(0,0);
   }
   
   //* Set up a line object. 
   public Line(double newSlope, double newIntercept)
   {
       set(newSlope, newIntercept);
   }
 
   //* Set up a line object. 
   public void set(double newSlope, double newIntercept)
   {
       slope = newSlope;
       intercept = newIntercept;
   }
   
   //* Set up a line object. 
   public void set(Point p1, Point p2)
   {
       slope = Point.getSlope(p1,p2);
       intercept = p1.getYcord() - slope * p1.getXcord();
   }
   
   
   //* Set line to string. 
   public String toString()
   {
       String equation;
       
       if (slope == 0)
           equation = "y = " + intercept;
       
       else if (intercept == 0)
           equation = "y = " + slope + "x ";
       
       else if (intercept > 0)
           equation = "y = " + slope + "x + " + intercept;
       else
           equation = "y = " + slope + "x - " + Math.abs(intercept);
       
       return equation;
   }
   
   
   
   
   
   
   //* Get slope info. 
   public double getSlope()
   {
       return slope;
   }
   
   //* Get intercept info 
   public double getIntercept()
   {
       return intercept;
   }
    
   
}
