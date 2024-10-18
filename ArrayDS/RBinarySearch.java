// Java implementation of recursive Binary Search
import java.util.*;
class RBinarySearch {
    // Returns index of x if it is present in arr[low..
    // high], else return -1
    public static int RbinarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return RbinarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return RbinarySearch(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver code
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
        int x;
        System.out.println("Enter the key to search in recursive binary : ");
        x=sc.nextInt();
        int result = RbinarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index " + result);
    }
}