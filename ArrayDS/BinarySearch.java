import java.util.*;
class BinarySearch {
    // Returns index of x if it is present in arr[].
    public static int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;
            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }
        // If we reach here, then element was
        // not present
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
        System.out.println("Enter the size of the array : ");
        x=sc.nextInt();
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}