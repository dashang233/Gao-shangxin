public class Method01{
	public static void main(String[] args){
		AA aa = new AA();
		boolean b1 = aa.odd(100);
		System.out.println(b1);
		aa.print01(8,9,'#');
		
		//��¡����
		Person p = new Person();
		p.name = "Tom";
		p.age = 10;
		Person p2 = aa.copyPerson(p); //��ɶ��󿽱���p��p2Ϊ������������������ͬ
		System.out.println("p���֣�"+ p2.name +"������Ϊ��"+ p2.age);
		System.out.println("p2���֣�"+ p2.name +"������Ϊ��"+ p2.age);
		System.out.println(p==p2);
	}
}
class AA{
	//�ж�����ż��
	public boolean odd(int n){
		// if(n % 2 == 0){
			// return true;
		// }else{
			// return false;
		// }
		//��Ԫ�����д��
		return n % 2 == 0 ? true : false;
	}
	
	//��ӡָ�����������ַ�
	public void print01(int m, int n, char s){
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				System.out.print(s);	
			}
			System.out.print("\n");	
		}
	}
	
	//��¡����
	public Person copyPerson(Person p){ //��������ΪPerson
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