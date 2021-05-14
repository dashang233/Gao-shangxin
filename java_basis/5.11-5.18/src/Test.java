/**
 * author dashang
 * date 2021/5/13 - 13:35
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        T t = new T();
        t.fb(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class T{
    public void fb(int[] arr1){
        int[] arr2 = {4,5,6};
        arr1[0] = 9;
    }
}