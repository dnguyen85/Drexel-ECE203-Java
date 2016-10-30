package A1;

public class Concat
{
    public static void main (String[] args) 
    {
        String firstString = "First String";
        String secondString = "Second String";

        System.out.println("First str: " + firstString);
        System.out.println("Second str: " + secondString);

        String thirdString = firstString + secondString; 
        System.out.println("Concat str: " + thirdString);
        System.out.println("Lower case: " + thirdString.toLowerCase());
    }
}
