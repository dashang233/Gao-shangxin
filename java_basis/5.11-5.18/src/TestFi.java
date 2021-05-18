public class TestFi {
    public static void main(String[] args) {
        Fi f = new Fi();
        int n = 6;
        f.fi(n);
        for (int i = 0; i < n; i++) {
            System.out.println(f.arr[i]);
        }
    }
}
class Fi{
    int[] arr;
    public int fi(int n){
        if(n == 1 || n == 2){
            int[] arr2 = new int[n];
            arr2[0] = 1;
            arr2[n-1] = 1;
            arr = arr2;
            return 1;
        }else{
            int[] arr2 = new int[n];
            arr2[n-1] = fi(n-2) + fi(n-1);
            for (int i = 0; i < arr2.length-1; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            return arr2[n-1];
        }

    }
}