public class Meeting{
	public static void main(String[] args){
		//冒泡排序
		// int[] arr = {1,3,2,7,5};
		// int change = 0;
		// for(int i = 0; i < arr.length-1; i++){
			// for(int j = 0; j < arr.length-i-1; j++){
				// if(arr[i] > arr[i+1]){
					// change = arr[i];
					// arr[i] = arr[i+1];
					// arr[i+1] = change;
				// }
			// }
		// }
		// for(int i = 0; i < arr.length; i++){
			// System.out.print(arr[i]);
		// }
		
		//杨辉三角
		int[][] arr = new int[10][];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];
			for(int j = 0; j < arr[i].length; j++){
				if(j==0 || j==arr[i].length-1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				
				//打印
			System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
	}
}