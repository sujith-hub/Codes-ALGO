// Recursive Java program for insertion sort
import java.util.*;
public class insertionSortRecursive
{
    // Recursive function to sort an array using
    // insertion sort
    static void insertionSortRecursive1(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;
        // Sort first n-1 elements
        insertionSortRecursive1( arr, n-1 );
        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;
        /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    // Driver Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("Enter the elements into the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sorted array: ");
        insertionSortRecursive1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}