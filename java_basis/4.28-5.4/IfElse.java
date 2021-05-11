import java.util.Scanner;
public class IfElse{
	public static void main(String[] args){
		// System.out.println("请输入年龄");
		// Scanner scanner = new Scanner(System.in);
		// int age = scanner.nextInt();
		// if(age > 18){
			// System.out.println("请认真工作");
		// }else{
			// System.out.println("请好好学习");
		// }
		
		// double d1 = 10.1;
		// double d2 = 12.3;
		// if((d1 > 10) && (d2 < 20) ){
			// System.out.println(d1 + d2);
		// }
		// int n1 = 10;
		// int n2 = 5;
		// int sum = n1 + n2;
		// if(sum % 3 == 0 && sum % 5 == 0){
			// System.out.println("可被3、5整除");
		// }else{
			// System.out.println("不可被3、5整除");
		// }
		
		//多分支
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入信用积分");
		// int score = scanner.nextInt();
		// if(score >= 1 && score <=100){
			// if(score == 100){
				// System.out.println("信用极高");
			// }else if(score > 80 && score <= 99){
				// System.out.println("信用优秀");
			// }else if(score >= 60 && score <= 80){
				// System.out.println("信用一般");
			// }else{
				// System.out.println("信用不及格");
			// }
		// }else{
			// System.out.println("输入错误");
		// }
		
		//嵌套分支
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入成绩：");
		// double score = scanner.nextDouble();
		
		// if(score >= 8.0){
			// System.out.println("恭喜您，进入决赛！");
			// System.out.println("请输入性别：");
			// char gender = scanner.next().charAt(0);
			// if(gender == '男'){
				// System.out.println("进入男子组。");
			// }else{
				// System.out.println("进入女子组。");
			// }
		// }else{
			// System.out.println("很遗憾，再接再励！");
		// }
		
		//嵌套分支 打印票价
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入季节");
		String season = scanner.next();
		if(season.equals("旺季")){
			if(age >= 18 && age <= 60){
				System.out.println("票价60");
			}else if(age < 18){
				System.out.println("票价30");
			}else{
				System.out.println("票价20");
			}
			
		}else{
			if(age >= 18 && age <= 60){
				System.out.println("票价40");
			}else{
				System.out.println("票价20");
			}
		}
	}
}