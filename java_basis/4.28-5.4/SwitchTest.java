import java.util.Scanner;
public class SwitchTest{
	public static void main(String[] args){
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入");
		// char c1 = scanner.next().charAt(0);
		// switch(c1){
			// case 'a':
				// System.out.println("星期一");
				// break;
			// case 'b':
				// System.out.println("星期二");
				// break;
			// default:
				// System.out.println("其他");
				// break; // 有无均可
		// }
		// System.out.println("退出Switch程序。。。");
		
		// char c1 = 'a';
		// switch(c1){
			// case 'a':
				// System.out.println("星期一");
				// // break;
			// case 10:
				// System.out.println("星期二");
				// break;
			// // default  // 有无均可
			
		//exercise01
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入a-e");
		// char c1 = scanner.next().charAt(0);
		// switch(c1){
			// case 'a':
			// System.out.println("A");
			// break;
			// case 'b':
			// System.out.println("B");
			// break;
			// default:
			// System.out.println("other");
			// break;
		// }
		
		//exercise02
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入成绩");
		// double d1 = scanner.nextDouble();
		
		// if(d1 >= 0 && d1 <= 100){
			// switch((int)(d1 / 60)){
				// case 1:
				// System.out.println("合格");
				// break;
				// case 0:
				// System.out.println("不合格");
			// }
		// }else{
			// System.out.println("输入有误");	
		// }
		
		//exercise03
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int num = scanner.nextInt();
		switch(num){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
		
	}
}