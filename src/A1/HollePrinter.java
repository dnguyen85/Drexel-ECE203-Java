package A1;

/**
 * (Prob. 6) This class switches the letters 'e' and 'o' in a String.
 * Hint: use the method replace repeatedly.
 */
public class HollePrinter
{
    public static void main(String[] args)
    {
        String str = "Hello, World!";  

        // Replace all 'e' with a non-used char
        str = str.replace("e", "%");
        // Replace all 'o' with 'e'
        str = str.replace("o", "e");
        // Replace all non-used char with 'o'
        str = str.replace("%", "o");

        // Print our resulting string
        System.out.println(str);
    }
}
