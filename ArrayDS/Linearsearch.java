import java.util.*;
class Linearsearch {
    public static int lsearch(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    // Driver code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);  
        int n;
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("Enter the elements into the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x;
        System.out.print("Enter the number to search in linear form: ");
        x=sc.nextInt();
        // Function call
        int result = lsearch(arr, arr.length, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}