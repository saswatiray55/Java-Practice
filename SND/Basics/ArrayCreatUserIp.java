// import java.util.Scanner;
import java.util.*;

public class ArrayCreatUserIp
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

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}