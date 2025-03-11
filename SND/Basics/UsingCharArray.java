import java.util.*;

public class UsingCharArray
{
    public static void main(String[] args)
    {
        String str = "Saswati";

        char[] word = str.toCharArray();
        for(char ch : word)
        {
            System.out.print(ch + " ");
        }

    }
}