import java.util.Scanner;

public class palindrome {
    public static void main(String [] args)
    {
        // get the word from the user
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a word: "); 
        String input = scanner.nextLine();
        String reverse = "";
        
        //The for loop reverses the word.
        for(int i = input.length()-1; i >= 0; i--)
        {
            reverse += input.charAt(i);
        }
         // checks for a palindrome
        if(input.equalsIgnoreCase(reverse))
        {
            System.out.println("It's a palindrome!");
        }
        else
        {
            System.out.println("Not a Palindrom.");
        }
    }
}
