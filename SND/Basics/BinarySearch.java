import java.util.*;

public class BinarySearch
{

    public static int findEle(int arr[], int n, int k)
    {
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == k)
            {
                return mid;
            }
            else  if(arr[mid] > k)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = findEle(arr, n, k);
        System.out.print(result == -1 ? "Not Present" : "Index is " + result);

    }
}