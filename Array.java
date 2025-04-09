public class Array {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        
        // accessing array elements
        // System.out.println("Accessing array elements:");
        // System.out.println("First element: " +  arr[0]);
        // System.out.println("Second element: " + arr[1]);
        // System.out.println("Third element: " + arr[2]);
        // System.out.println("Fourth element: " + arr[3]);
        // System.out.println("Fifth element: " + arr[4]);

        // Looping through the array
        // System.out.println("Using for Loop to iterate through the arrya:");
        // for (int i = 0; i < arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // Using for-each Loop to iterate through the array
        // System.out.println("Using for-each Loop to iterate the array:");
        // for (int num : arr)
        // {
        //     System.out.println(num);
        // }

        int [] numbers = {2, -9, 0, 5, -25, 22, 9, 8, 12};
        // Computing the sum of and Avrage of the array elements
        int sum = 0;
        Double average;

        // Acces all elements of using for-each Loop
        // add each element to the sum
        for (int number : numbers)
        {
            sum += number;
        }

        // get the total number of elements in the array
        int arrayLength = numbers.length;

        // caculate the average
        // covert the average from int to double
        average = ((double)sum / (double)arrayLength);

        // print the sum and average of the array elements
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + average);
        

        // Sorting the array in ascending order
        System.out.println("Sorting the array in asceding order:");
        for (int i = 0; i < numbers.length -1; i++)
        {
            for (int j = 0; j < numbers.length - i - 1; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    // swap number [j] and number[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    System.out.println("Swapping " + numbers[j] + " and " + numbers[j + 1]);
                }
            }
        }
        // print the sorted array
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }


    }
}