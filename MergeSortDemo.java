import java.util.*;


public class MergeSortDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        int[] a = ArrayUtil.randomIntArray(60000, 60000);
        System.out.println(Arrays.toString(a));

        System.out.println("Sorting...");
        Thread.sleep(20000);
        MergeSorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
