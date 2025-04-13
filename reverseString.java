public class reverseString {
    public static void main(String []args)
    {
        String origanal = "Hello";
        String reverse = "";
        // The for loop reverses the word.
        for(int i = origanal.length()-1; i >= 0; i--)
        {
            reverse += origanal.charAt(i);
        }
        System.out.println("Reversed " + reverse);
    }
}
