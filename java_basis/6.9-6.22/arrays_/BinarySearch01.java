package arrays_;

import java.util.Arrays;
import java.util.List;

public class BinarySearch01 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,10,6};
//        Arrays.sort(arr);
//        int i = Arrays.binarySearch(arr, 5);
//        System.out.println(i);

        int[] ints = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(ints));
        List<Integer> integers = Arrays.asList(1, 4, 7, 9);
        System.out.println(integers);
    }
}
