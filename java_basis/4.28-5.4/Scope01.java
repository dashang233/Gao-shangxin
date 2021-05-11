public class Scope01{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.eat(); //本条语句执行结束，方法eat创建的name属性即销毁
		System.out.print(cat.name); //输出"Tom"，因为方法eat创建的name和属性name地址不同
	
	
	}
}

class Cat{
	String name = "Tom";
	public void eat(){
		String name = "Jack";
	}
}