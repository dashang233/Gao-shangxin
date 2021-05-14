import java.util.Scanner; //表示导入java.util下的Scanner类
public class Input{
	public static void main(String[] args){
		//接收用户输入
		//1 引入Scanner所在包（欲使用其中的包）
		//2 创建实例
		Scanner scanner = new Scanner(System.in);
		//3 接收用户输入，使用相关方法
		System.out.println("请输入名字");
		String name = scanner.next(); 
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入工资");
		double sal = scanner.nextDouble();
		System.out.println("名字："+name+" 年龄:"+age+" 薪水:"+sal);
	}
}