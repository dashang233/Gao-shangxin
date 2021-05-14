//养猫
class Cat{
	String name;
	int age;
	String color;
	public void shout(){
		System.out.println("喵");
	}
	
	public void cal01(int n){ //n为形参
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
}
public class Object01{
	public static void main(String[] args){
		//创建一只猫，赋给cat1,cat1即一个对象的引用 
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 13;
		cat1.color = "白色";
		System.out.println(cat1.name);
		cat1.shout();
		cat1.cal01(100);
		int resturnRes = cat1.getSum(1,2); //将方法返回值赋给变量resturnRes
		System.out.println(resturnRes);
	 }
}