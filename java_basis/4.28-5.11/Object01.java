//��è
class Cat{
	String name;
	int age;
	String color;
	public void shout(){
		System.out.println("��");
	}
	
	public void cal01(int n){ //nΪ�β�
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
		//����һֻè������cat1,cat1��һ����������� 
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 13;
		cat1.color = "��ɫ";
		System.out.println(cat1.name);
		cat1.shout();
		cat1.cal01(100);
		int resturnRes = cat1.getSum(1,2); //����������ֵ��������resturnRes
		System.out.println(resturnRes);
	 }
}