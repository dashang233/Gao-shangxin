import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
		//求平均体重
		//创建数组
		// double[] hens = {1,2,3,4,5,6};
		// //遍历数组
		// double sum = 0;
		// for(int i = 0; i < hens.length; i++){ //数组下标从0开始计数
			// // System.out.println("第"+(i+1)"");
			// sum += hens[i];
		// }
		// System.out.println("总和为：" + sum + "，均值为：" + (sum /hens.length));
		
		//输入成绩
		// double[] score;
		// score = new double[5];
		// Scanner scanner = new Scanner(System.in);
		// for(int i = 0; i < score.length; i++){
			// System.out.println("请输入"+(i+1)+"个成绩");
			// score[i] = scanner.nextDouble();
			
		// }
		// System.out.println(score);
		
		//exercise01
		// char[] letter = new char[26];
		// for(int i = 0; i < letter.length; i++){
			// letter[i] = (char)('A' + i); //右侧int类型，左侧char，需要强转
		// }
		// for(int i = 0; i < letter.length; i++){
			// System.out.print(letter[i] + " ");
		// }
		
		//求数组最大值
		// int[] num = {4, -1, 9, 10, 23};
		// int max = num[0];
		// int id = 0;
		// for(int i = 1; i < num.length; i++){ //从第二个元素开始
			// if(num[i] > max){
				// max = num[i];
				// id = i;
			// }
		// }
		// System.out.print("最大值为"+max+"，下标为"+id);
		
		//引用赋值
		// int[] arr1 = {1, 2, 3};
		// int[] arr2 = arr1;
		// arr2[0] = 10;
		// System.out.println("arr1元素：");
		// for(int i = 0; i < arr1.length; i++){ 
			 // System.out.print(arr1[i]+" ");
		// }
		
		//数组反转
		//方法1
		// int[] arr1 = {11,22,33,44,55,66};
		// int[] arr2 = new int[arr1.length];
		// for(int i = 0, j = 5; i < arr1.length; i++, j--){
			// arr2[i] = arr1[j];
		// }
		// arr1 = arr2; //引用赋值
		// for(int i = 0, j = 5; i < arr1.length; i++, j--){
			// System.out.print(arr1[i]+" ");
		// }
		
		//方法2
		// int change = 0;
		// for(int i = 0; i < (arr1.length/2); i++){
			// change = arr1[i];
			// arr1[i] = arr1[arr1.length-i-1];
			// arr1[arr1.length-i-1] = change;
			
		// }
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//数组扩容（动态添加）
		// int[] arr1 = {1, 2, 3};
		// Scanner scanner = new Scanner(System.in);
		// while(true){
			// System.out.println("是否添加新值, y/n ?");
			// char answer = scanner.next().charAt(0);
			// if(answer != 'y'){
				// break;
			// }
			// int[] arr2 = new int[arr1.length + 1];
			// for(int i = 0; i < arr1.length; i++){
				// arr2[i] = arr1[i];
			// }
			// System.out.println("请输入要添加的整数值");
			// int num = scanner.nextInt();
			// arr2[arr2.length - 1] = num;
			// arr1 = arr2; //指向新数组
			// for(int i = 0; i < arr1.length; i++){
				// System.out.print(arr1[i]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//数组缩减
		int[] arr1 = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		do{
			int[] arr2 = new int[arr1.length - 1];
			for(int i = 0; i < arr1.length-1; i++){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
			for(int i = 0; i < arr1.length; i++){
				System.out.print(arr1[i] + " ");
			}
			System.out.println("是否继续缩减，y/n ?");
			char answer = scanner.next().charAt(0);
			if(answer != 'y' || arr1.length==1){
				break;
			}
		}while(true);
		
		
		
		
		
		
		
	}
}