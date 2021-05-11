import java.util.Scanner;
public class While01{
	public static void main(String[] args){
		// int i = 1;
		// while(i <= 10){
			// System.out.println("你好" + i);
			// i++;
		// }
		
		//exercise01
		// int i = 1;
		// while(i <= 100){
			// if(i % 3 == 0){
				// System.out.println(i);
			// }
			// i++;
		// }
		
		//exercise02
		// int i = 40;
		// while(i <= 200){
			// if(i % 2 == 0){
				// System.out.println(i);
			// }
			// i++;
		// }
		
		//do-while
		// int i = 1;
		// do{
			// System.out.println(i);
			// i++;
		// }while(i <= 10);
		
		//exercise01
		// int i = 1;
		// int sum = 0;
		// do{
			// sum = sum + i;
			// i++;
		// }while(i <= 100);
		// System.out.println(sum);
		
		//exercise02
		// int i = 1;
		// int count = 0;
		// do{
			// if(i % 5 == 0 && i % 3 != 0){
				// count++;
			// }
			// i++;
		// }while(i <= 200);
		// System.out.println(count);
		
		//exercise03
		char answer = ' ';
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("闪电五连鞭");
			System.out.println("还钱吗？y/n");
			answer = scanner.next().charAt(0);
		}while(answer != 'y');
	}
}