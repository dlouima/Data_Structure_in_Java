import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort arr = new MergeSort();

        int[] a = { 100, 1, 3, 7, 8, 24, 1, 8, 63, 52, 75, 58 };

        System.out.println(Arrays.toString(arr.mergeSort(a)));
    }

}
