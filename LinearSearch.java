// Linear Search with array.
import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of delete: ");
        int valueToDelete = scanner.nextInt();
        
        int indexToDelete = -1; // holds the value were deleting
        for (int i = 0; i < arr.length; i++)  
        {
            if (arr[i] == valueToDelete)
            {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete != -1)
        {
            for (int i = indexToDelete; i < arr.length-1; i++)
            {
                arr[i] = arr[i+1];
            }
            arr[arr.length -1] = 0;

            System.out.println("Updated array: ");
            for (int num : arr)
            {
                System.out.println(num + " ");
            }

        }
        else
        {
            System.out.println("Value not found.");
        }
    }
}
