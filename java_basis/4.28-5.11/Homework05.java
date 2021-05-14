import java.util.Scanner;
public class Homework05{
	public static void main(String[] args){
		//插入新值并排序
		//方法1
		// int[] arr1 = {10,12,45,90};
		// int[] arr2 = new int[arr1.length+1];
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("请输入要插入的值：");
		// int num = scanner.nextInt();
		// int count = -1; //记录插入位置
		// for(int i = 0; i < arr1.length; i++){
			// if(arr1[i] <= num){
				// arr2[i] = arr1[i];
			// }else{
				// count = i; //记录插入位置
				// arr2[i] = num;
				// break;
			// }
		// }
		// if(count == -1){ //num比arr1所有元素都大
			// arr2[arr1.length] = num;
		// }else{
			// for(int i = count; i < arr1.length; i++){
			// arr2[i+1] = arr1[i];
		// }
		// arr1 = arr2;
		// }
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//方法2
		//1 定位
		// int[] arr1 = {10,12,45,90};
		// int num = 23; //需插入的数
		// int count = -1; //记录插入位置
		// for(int i = 0; i < arr1.length; i++){
			// if(arr1[i] > num){
				// count = i;
				// break;
			// }
		// }
		// if(count == -1){
			// count = arr1.length;
		// }
		// //2 扩容
		// int[] arr2 = new int[arr1.length+1];
		// for(int i = 0, j = 0; i < arr2.length; i++){ //i一直加，j暂停一次
			// if(i != count){
				// arr2[i] = arr1[j];
				// j++; //跳过j但不跳过i
			// }else{
				// arr2[i] = num;
			// }
		// }
		// arr1 = arr2; //更新
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//随机数组，倒序打印,查找最大、最小值
		// kint[] arr1 = new int[10];
		// int max = arr1[0];
		// int index = 0;
		// for(int i = 0; i < arr1.length; i++){
			// arr1[i] = (int)(Math.random()*100) + 1;
		// }
		// //倒序
		// for(int i = arr1.length-1; i >= 0; i--){
			// System.out.print(arr1[i]+" ");
		// }
		// System.out.print("\n");
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		// for(int i = 1; i < arr1.length; i++){
			// if(arr1[i] > max){
				// max = arr1[i];
				// index = i;
			// }
		// }
		// System.out.print("\n");
		// System.out.print("最大值为："+max+"，下标为："+index);
		
		//冒泡排序
		int[] arr1 = {24,69,80,57,13};
		int num = -1; //临时交换变量
		int count = -1; //记录交换次数
		for(int i = 0; i < arr1.length-1; i++){
			for(int j = 0; j < arr1.length-i-1; j++){
				if(arr1[j] > arr1[j+1]){
					num = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = num;
					count++;
				}
			}
			if(count == -1){
				break;
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		
		
	}
}