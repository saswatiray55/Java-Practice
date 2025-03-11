import java.util.*;

public class LinearSearch
{
    public static int findEle(int arr[], int n, int k)
    {
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == k)
            {
                return i;
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
