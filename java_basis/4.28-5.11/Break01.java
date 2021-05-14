import java.util.Scanner;
public class Break01{
	public static void main(String[] args){
		//随机生成97次数
		// int count = 0;
		// for(int i = 1; i <= 100; i++){
			// int ran = (int)(Math.random()*100) + 1;
			// // System.out.println(ran);
			// if(ran == 97){
				// break;
			// }
			// count++;
		// }
		// System.out.println("共用"+count+"次");
		
		//数字和第一次大于20
		// int count = 0;
		// int sum = 0;
		// for(int i = 1; i <= 100; i++){
			// if(sum > 20){
				// break;
			// }
			// sum += i; //累积，放在if后面
			// count++;
		// } 
		// System.out.println("当前 数为："+count);
		
		//登录验证
		Scanner scanner = new Scanner(System.in);
		String name = "";
		String password = "";
		for(int i = 1; i <= 3; i++){
			System.out.println("请输入用户名");
			name = scanner.next();
			System.out.println("请输入密码");
			password = scanner.next();
			if("丁真".equals(name) && "666".equals(password)){
				System.out.println("登陆成功");
				break;
			}
			System.out.println("输入错误，还有" + (3-i) + "次机会");
			
		}
	}
}