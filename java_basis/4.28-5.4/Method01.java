public class Method01{
	public static void main(String[] args){
		AA aa = new AA();
		boolean b1 = aa.odd(100);
		System.out.println(b1);
		aa.print01(8,9,'#');
		
		//克隆对象
		Person p = new Person();
		p.name = "Tom";
		p.age = 10;
		Person p2 = aa.copyPerson(p); //完成对象拷贝，p与p2为两独立对象，且属性相同
		System.out.println("p名字："+ p2.name +"，年龄为："+ p2.age);
		System.out.println("p2名字："+ p2.name +"，年龄为："+ p2.age);
		System.out.println(p==p2);
	}
}
class AA{
	//判断奇数偶数
	public boolean odd(int n){
		// if(n % 2 == 0){
			// return true;
		// }else{
			// return false;
		// }
		//三元运算符写法
		return n % 2 == 0 ? true : false;
	}
	
	//打印指定行列数的字符
	public void print01(int m, int n, char s){
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(s);	
			}
			System.out.print("\n");	
		}
	}
	
	//克隆对象
	public Person copyPerson(Person p){ //返回类型为Person
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
	
}
class Person{
	String name;
	int age;
}