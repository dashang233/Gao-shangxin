public class Var{
	public static void main(String[] args){
		//测试加号
		int age = 20;
		double score = 89.1;
		char gender = '男';
		String name = "张三";
		System.out.println(age + score);
		System.out.println(age + name);
		
		//整型
		int n1 = 1;
		// long n2 = 1L; //错误
		long n2 = 1L; //数值默认int，需在后面加L
		
		//浮点型
		float n3 = 1.2F;
		 
		//字符型
		char c1 = 100; //输出数字代表的字符（编码概念）
		char c2 = '你';
		System.out.println(c1);
		System.out.println(c2);
		char c3 = 97;
		System.out.println(c3); //输出 a
		char c4 = 'a';
		System.out.println((int)c4); //输出97  
		System.out.println('a' + 10); //输出107
		
		//布尔型
		boolean isPass = true;
		if(isPass = true){
			System.out.println("考试通过，恭喜！");
		}else{
			System.out.println("没有通过，继续努力~");
		}
		
	}
}