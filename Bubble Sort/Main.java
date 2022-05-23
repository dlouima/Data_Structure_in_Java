import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = { 12, 25, 36, 42, 52, 15, 86, 45, 38, 29 };
        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort.bubbleSort(ar);
        System.out.println(Arrays.toString(ar));

    }

}
