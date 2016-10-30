package A1;

import java.util.*;

/**
 * (Prob. 7) This class, with the help of GregorianCalendar, print the following:
 * 1. The date of your birth
 * 2. The date on which you will be one billion seconds old
 */
public class Cal
{
    public static void main(String[] args)
    {
        GregorianCalendar myBirthday = new GregorianCalendar(1985, Calendar.APRIL, 10);

        // Quite ugly text print, using default toString()
        System.out.println("My date of birth is: " + myBirthday);

        // A little better print, by getting appropriate fields from objects
        int year = myBirthday.get(Calendar.YEAR);
        int month = myBirthday.get(Calendar.MONTH);
        int day = myBirthday.get(Calendar.DAY_OF_MONTH);

        System.out.println("The date of my birth is " + month + "-" + day + "-" + year);

        // Compute time for 1B second old by adding 1B into `SECOND` field
        myBirthday.add(Calendar.SECOND, 1000000000);
        // Get the new date
        year = myBirthday.get(Calendar.YEAR);
        month = myBirthday.get(Calendar.MONTH);
        day = myBirthday.get(Calendar.DAY_OF_MONTH);

        System.out.println("I will be a billion seconds old on" + month + "-" + day + "-" + year);
    }
}


