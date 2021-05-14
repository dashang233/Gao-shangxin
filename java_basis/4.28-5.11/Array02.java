public class Array02{
	public static void main(String[] args){
		//二维数组
		// int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		// for(int i = 0; i < arr1.length; i++){ //遍历数组
			// for(int j = 0; j < arr1[i].length; j++){ //遍历每个元素
				// System.out.print(arr1[i][j]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//列数不确定
		// int[][] arr = new int[3][]; //只创建二维数组，没有为元素数组开辟空间
		// for(int i = 0; i < arr.length; i++){
			// //为每一个一维数组开辟空间
			// arr[i] = new int[i+1];
			// for(int j = 0; j < arr[i].length; j++){
				// arr[i][j] = i+1;
			// }
		// }
		// for(int i = 0; i < arr.length; i++){
			// for(int j = 0; j < arr[i].length; j++){
				// System.out.print(arr[i][j]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//遍历二维数组
		// int[][] arr = {{4,6},{1,4,5,7},{-2}};
		// int sum = 0;
		// for(int i = 0; i < arr.length; i++){
			// for(int j = 0; j < arr[i].length; j++){
				// sum += arr[i][j];
			// }
		// }
		// System.out.print("总和为："+sum);
		
		//杨辉三角
		int[][] arr = new int[10][];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];  //每一个元素为一个一维数组
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0 || j == (arr[i].length-1)){
					arr[i][j] = 1;
				}else{ //从第三行开始的相加规律
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}