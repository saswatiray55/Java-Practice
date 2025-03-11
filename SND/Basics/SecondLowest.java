import java.util.*;

public class SecondLowest
{
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
        Arrays.sort(arr);
        
        for(int i = 1; i <n; i++)
        {
            if(arr[i] != arr[i-1])
            {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}