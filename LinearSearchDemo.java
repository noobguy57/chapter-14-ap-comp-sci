import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class LinearSearchDemo
{
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(10000000, 10000000);
        System.out.println(Arrays.toString(a));
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean done = false;
        int runs = 0;
        while (!done)
        {

            //System.out.println("What number do you want to search for?");
            int n = 1 + runs;
            //System.out.println(n);
            if (n == -1) {done = true;}
            if (runs>100000000) {done = true;}
            else
                {
                    int pos = LinearSearcher.search(a, n)+1;
                    if (pos == 0) {
                        System.out.println(n + " is not stored in the table.");
                     }
                else {
                         System.out.println("Found " + n + " at " + pos);
                     }
                    runs++;
                }
        }
    }
}
