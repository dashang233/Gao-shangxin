class FB{
    // public int sum(int n){
        // if(n>=1){
            // if(n==1||n==2){
                // return 1;
            // }
            // else{
                // return sum(n-1)+sum(n-2);
        // }
        // }
        // else{
            // System.out.println("请输入大于0的数");
            // return -1;
        // }

    // }
	// public int[] fb(int n){
	// int[] arr = new int[n];
    // for(int i; i<n; i++){
        // if(i <= 1){
           // arr[i] = 1;
        // }else{
           // arr[i] = fb(i-1)+fb(i-2);
        // }
    // }
	// return arr;
	
	
	
	// }


	public int fb(int n){
		// if(n >= 1){
			// if(n==1 || n==2){
				// return 1;
			// }else{
				// return fb(n-1) + fb(n-2);
			// }
		// }else{
			// System.out.println("请输入大于0的数");
			// return -1;
		// }
		if(n==1 || n ==2){
			System.out.print(1 + " ");
			return 1;
		}else{
			System.out.print(fb(n-1) + " ");
			return fb(n-1) + fb(n-2);
		}
	}

}
public class TestFB {
    public static void main(String[] args) {
        // int n=7;
        // T t=new T();
        // for(int i=3;i<=n;i++){
            // System.out.println(t.sum(i));
        // }
		
		int n = 2;
		FB t = new FB();
		// for(int i = 1; i <= n; i++){
			// System.out.print(t.fb(i) + " ");
		// }
		t.fb(n);
		
    }
}


