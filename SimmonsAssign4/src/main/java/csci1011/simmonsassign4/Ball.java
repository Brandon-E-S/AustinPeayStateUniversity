package csci1011.simmonsassign4;
import java.util.Scanner;
/**
 *CSCI 1011 Assign 4
 * @author Brandon Simmons
 */
public class Ball {
    
    private double hDist;
    private double vDist;
    private double hSpeed;
    private double vSpeed;
    private double tempVSpeed;
    private double tempHDist;
    private double tempVDist;
    
    public double getHDist()
            {
                return this.hDist;
            }
    
    public double getVDist()
    {
        return this.vDist;
    }
    
    public double getHSpeed()
    {
        return this.hSpeed;
    }
    
    public double getVSpeed()
    {
        return this.vSpeed;
    }
    
    public void setBall(double newHDist, double newVDist, double newHSpeed, double newVSpeed)
    {
        this.hDist = newHDist;
        this.vDist = newVDist;
        this.hSpeed = newHSpeed;
        this.vSpeed = newVSpeed;
    }
    
    public void initialize(double angle, double velocity, double height)
    {
        this.hDist = 0;
        this.vDist = height;
        this.hSpeed = velocity * Math.cos(Math.toRadians(angle));
        this.vSpeed = velocity * Math.sin(Math.toRadians(angle));
    }
    
    public void update(double time)
    {
        this.tempHDist = (time * this.hSpeed);
        this.hDist = this.hDist + this.tempHDist;
        this.tempVSpeed = this.vSpeed - (9.8 * time);
        this.tempVDist = (((this.tempVSpeed + this.vSpeed) / 2) * time);
        this.vDist = this.tempVDist + this.vDist;
        this.vSpeed = this.tempVSpeed;
    }
    
    
    
    
}
