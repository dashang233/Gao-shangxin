public class BubbleSort{
	public static void main(String[] args){
		//冒泡排序
		int[] arr1 = {24,69,80,57,13};
		// int[] arr1 = {1,2,3,4,5};
		int num = 0; //用于辅助交换的变量
		int count = 0; //记录交换次数,优化算法，若第一轮一次都不交换则直接退出
		for(int i = 0; i < arr1.length-1; i++){ //一共进行四次排序
			for(int j = 0; j < arr1.length-i-1; j++){ //每轮排(arr1.length-i-1)次，次数逐渐减少
				if(arr1[j] > arr1[j+1]){ //注意是j不是i
					num =  arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = num;
					count++;
				}
			}
			if(count == 0){
				break;
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		
	}
}