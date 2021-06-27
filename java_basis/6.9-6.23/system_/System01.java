package system_;

import java.util.Arrays;

public class  System01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[3];
        System.arraycopy(arr1,1,arr2,1,2);
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.currentTimeMillis());

    }
}
