public class VarConvert{
	public static void main(String[] args){
		//类型自动转换
		int num = 'a'; //正确
		double d1 = 80; //正确
		System.out.println(num); //97
		System.out.println(d1); //80.0
		
		int n1 = 10;
		//float d2 = n1 + 1.1; //错误
		float d2 = n1 + 1.1F; //正确
		byte b1 = 10; //正确
		// byte b2 = n1; //错误
		// char c1 = b1; //错误
		
		byte b2 = 1;
		byte b3 = 1;
		short s1 = 1;
		int s2 = b2 + s1; //正确，右边转换为int然后进行计算
		// byte b4 = b2 + b3; //错误，右边转换为int然后进行计算
		
		//强制类型转换
		int n2 = (int)1.9;
		System.out.println("n2:" + n2); //1
		byte b5 = (byte)2000;
		System.out.println("b5:" + b5); //-48(溢出)
		
		//基本数据类型转字符串
		int n3 = 100;
		String s3 = n3 + "";
		System.out.println(s3); //"100"
		//字符串转基本数据类型
		String s4 = "123";
		int num1 = Integer.parseInt(s4);
		double num2 = Double.parseDouble(s4);
		boolean b6 = Boolean.parseBoolean("true");
		System.out.println(s4.charAt(0)); //'1'
	}
}