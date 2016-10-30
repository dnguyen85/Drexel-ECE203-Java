package A1;

import java.awt.Rectangle;

/**
 * This class constructs two Rectangle objects, prints them, and then print the
 * intersection. What if the intersection is empty? 
 */
public class Intersection
{
    public static void main (String[] args) 
    {
        Rectangle r1 = new Rectangle(10, 10, 50, 70);        
        System.out.println("r1 = " + r1);

        // Create overlapping rectangle
        Rectangle r2 = new Rectangle(30, 30, 70, 50);
        System.out.println("r2 = " + r2);

        // Find Intersection
        Rectangle r3 = r1.intersection(r2);
        System.out.println("Intersection: " + r3);

        // Non-overlapping Rectangle cases
        Rectangle r4 = new Rectangle(100, 100, 70, 50);
        System.out.println("r4 = " + r4);

        // Output will have _negative width and height_
        Rectangle r5 = r1.intersection(r4);
        System.out.println("Intersection of r1 and r4 = " + r5);
    }
}


