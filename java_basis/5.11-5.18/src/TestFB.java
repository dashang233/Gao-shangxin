/**
 * author dashang
 * date 2021/5/13 - 12:53
 */

class FB {
    int[] arr = new int[0];
    public int fb(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                int[] arr2 = new int[n];
                arr2[0] = 1;
                arr2[n-1] = 1;
                arr = arr2;
                return 1;
            } else {
                int[] arr2 = new int[n];
                arr2[n - 1] = fb(n - 2) + fb(n - 1); //先n-2再n-1，否则20行arr长度不是n-1而是n-2
                for (int i = 0; i < n-1; i++){ //利用循环将前几个值加入数组arr2
                    arr2[i] = arr[i];
                }
                arr = arr2;
                return arr[n-1]; //返回arr数组末尾值
            }
        } else {
            System.out.println("请输入大于0的数");
            return -1;
        }
    }

}

public class TestFB {
    public static void main(String[] args) {
        int n = 6;
        FB t = new FB();
        t.fb(n);
//        System.out.println(Arrays.toString(t.arr));
        for (int i = 0; i < n; i++) {
            System.out.print(t.arr[i] + " ");
        }


    }
}



