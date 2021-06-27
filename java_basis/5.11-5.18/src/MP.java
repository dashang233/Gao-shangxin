import java.util.Arrays;

public class MP {
    public static void main(String[] args) {
        MP m = new MP();
        int[] arr = {3,-1,7,2};
        m.mp(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void mp(int[] arr){
        int change = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j+1] > arr[j]){
                    change = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = change;
                }
            }
        }
    }
}



