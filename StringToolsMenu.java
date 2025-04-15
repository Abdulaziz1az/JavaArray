import java.util.Scanner;

public class StringToolsMenu {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            // menu
            System.out.println("\nWelcome to String Tools:");
            System.out.println("1. Reverse a string");
            System.out.println("2. Check if it's a palindrome");
            System.out.println("3. Count character frequency");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter a string to reverse: ");
                    String str1 = scanner.nextLine();
                    System.out.println("Reversed: " + reverseString(str1));
                    break;
                
                case 2:
                    System.out.println("Enter a string to chek palindrome: ");
                    String str2 = scanner.nextLine();
                    if (isPalindrome(str2))
                    {
                        System.out.println("It is a palindrome.")
                    }
                    else
                    {
                        System.out.println("Not a palindrome.");
                    }
                    break;

                case 3:
                    System.out.println("Enter a string to count character: ");
                    String str3 = scanner.nextLine();
                    countFrequency(str3);
                    break;

                case 4:
                    System.out.println("Exiting... Goodby!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    
}
