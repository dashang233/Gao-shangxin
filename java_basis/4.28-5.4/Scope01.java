public class Scope01{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.eat(); //�������ִ�н���������eat������name���Լ�����
		System.out.print(cat.name); //���"Tom"����Ϊ����eat������name������name��ַ��ͬ
	
	
	}
}

class Cat{
	String name = "Tom";
	public void eat(){
		String name = "Jack";
	}
}