import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		//01 过路口
		// double left = 100000; //剩余多少钱
		// int count = 0; //保存过路口个数
		// while(true){ //死循环
			// if(left > 50000 ){
				// left *= 0.95;
				// count++;
			// }else if(left >= 1000){
				// left -= 1000;
				// count++;
			// }else{
				// break;
			// }
		// }
		// System.out.println("可"+ count + "次经过路口");
		
		//02 判断整数范围
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入一个整数");
		// int num = scanner.nextInt();
		// if(num > 0){
			// System.out.println("正整数");
		// }else if(num < 0){
			// System.out.println("负整数");
		// }else{
			// System.out.println("0");
		// }
		
		// 03判断是否为水仙花数
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入一个三位整数");
		// int num = scanner.nextInt();
		// int n1 = num / 100;
		// int n2 = num % 100 / 10;
		// int n3 = num % 10;
		// if(num == (Math.pow(n1, 3)+Math.pow(n2, 3)+Math.pow(n3, 3))){
			// System.out.println("输入了一个水仙花数");
		// }else{
			// System.out.println("输入的不是水仙花数");
		// }
		
		//04 不能被5整除，5个一行
		// int count = 0;
		// for(int i = 1; i <= 100; i++){
			// if(i % 5 != 0){
				// System.out.print(i + "\t");
				// count++;
				// if(count % 5 == 0){ //内层if写外面会多输出几行空格？
					// System.out.print("\n");
				// }
			// }
		// }
		
		//05 输出a-z、Z-A
		// for(char i = 'a'; i <= 'z'; i++){
			// System.out.print(i + " ");
		// }
		// System.out.print("\n");
		// for(char j = 'Z'; j >= 'A'; j--){
			// System.out.print(j + " ");
		// }
		
		//分数求和
		// double sum = 0;
		// for(double i = 1; i <= 100; i++){
			// sum += Math.pow(-1, i + 1) * 1/i ;
		// }
		// System.out.print(sum);
		
		//整数求和
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 100; i++){
			sum1 += i;
			sum2 += sum1;
		}
		System.out.print(sum2);
		
	}
}