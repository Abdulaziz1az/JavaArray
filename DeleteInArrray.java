public class DeleteInArrray {
    public static void main(String[] args)
    {
        int [] arr = { 10, 20, 30, 40, 50}; // size 5
        int deletePos = 2; // delete index [2] = 30

        for (int i = deletePos; i < arr.length-1; i++)
        {
            arr[i] = arr[i + 1];
            // arr[2] = arr[3] = [10, 20, 40, 40, 50]
            // arr[3] = arr[4]  = [10, 20, 40, 50, 50]
            // done
        }

        System.out.println("After deletion:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
