public class Constructor{
	public static void main(String[] args){
		Person p1 = new Person("Jack", 18);
		System.out.println(p1.name + " " +p1.age);
		Person p2 = new Person();
		System.out.println(p2.hashCode());
		System.out.print(p2.name + " " + p2.age);
	}
}

class Person{
	String name;
	int age;
	//������
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(){ //�޲ι�����
		age = 18;
	} 
}