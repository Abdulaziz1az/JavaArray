public class InsertInArray {
    public static void main(String [] args)
    {
        int[] arr = new int [6]; // size 5
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50; // we used 4 so array 5 is empty 

        int insertPos = 2; // index where we want to insert
        int newValue = 25;  // this the value we want to insert 

        for (int i = 4; i >= insertPos; i--) 
        {
            arr[i+1] = arr[i];
            // [5] = [4] 50 50
            // [4] = [3] 40 40 
            // [3] = [2] 30 30 
            // now we insert the  arr[insertPos] = newValue; it overwrite  the 30  
        }

        arr[insertPos] = newValue;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] +" ");
        }

    
    }
}
