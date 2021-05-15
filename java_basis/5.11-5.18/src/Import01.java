import java.util.Arrays;

/**
 * author dashang
 * date 2021/5/14 - 22:20
 */
public class Import01 {
    public static void main(String[] args) {
        //使用Arrays类的方法完成数组排序
        int[] arr1 = {1,8,2,-6,3};
        Arrays.sort(arr1); //静态类不可创建对象，直接调用方法
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
