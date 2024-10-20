// Recursive Java program to sort an array
// using selection sort
import java.util.*;
class RecursiveselectionSort
{
    // Return minimum index
    static int minIndex(int a[], int i, int j)
    {
        if (i == j)
            return i;
        // Find minimum of remaining elements
        int k = minIndex(a, i + 1, j);
        // Return minimum of current and remaining.
        return (a[i] < a[k])? i : k;
    }
    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    static void recurSelectionSort(int a[], int n, int index)
    {
        // Return when starting and size are same
        if (index == n)
            return;
        // calling minimum index function for minimum index
        int k = minIndex(a, index, n-1);
        // Swapping when index and minimum index are not same
        if (k != index){
           // swap
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(a, n, index + 1);
    }
    // Driver method
    public static void main(String args[]) 
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
        // Calling function
        recurSelectionSort(arr, arr.length, 0);
        //printing sorted array
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }
} 