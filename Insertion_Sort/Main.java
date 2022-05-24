import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = { 4, 2, 6, 5, 1, 3, };
        InsertionSort newarr = new InsertionSort();
        newarr.insertionSort(a);
        System.out.println(Arrays.toString(a));

    }

}
