public class Operator{
	public static void main(String[] args){
		//���������
		System.out.println(10 / 4); //2
		System.out.println(10.0 / 4); //2.5
		double d1 = 10 / 4;
		System.out.println(d1); //2.0
		
		//ȡģ���ࣩ
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		
		//����
		int i = 10;
		int j = i++; // i=11,j=310
		int k = ++i; // i=12,k=12
		System.out.println(i+"\t"+j+"\t"+k); //12 10 12
		i = i++; //i=12 �õ���ʱ����
		i = ++i; //i=13
		
		//��ϰ
		//59�죬�ϼ������㼸��
		int days = 59;
		int week = days / 7;
		int left = days % 7;
		System.out.println(days+"��"+week+"����"+left+"��"); 
		//�����¶�ת�����¶�
		double hua = 234.6;
		double she = 5.0 / 9 * (hua - 100);
		System.out.println(she);

		//��ϵ�����
		int a = 9;
		int b = 8;
		System.out.println(a > b);
		boolean flag = a > b;
		System.out.println(flag);
		
		//�߼������
		int age = 50;
		if(age > 20 && age < 90){
			System.out.println("ok1");
		}
		int a1 = 4;
		int b1 = 9;
		if(a1 < 1 & ++b1 < 50){
			System.out.println("ok2");
		}
		System.out.println("a1 = "+a1+" b1 = "+b1);
		//�߼��ǡ��߼����
		System.out.println(!(1 > 2)); //true
		System.out.println((10 > 1)^(3 < 5)); //false
		
		//��ֵ�����
		int n1 = 10;
		n1 /= 4; 
		System.out.println(n1); //2
		
		//��Ԫ�����
		int n2 = 10;
		int n3 = 12;
		int result = n2 > n3 ? ++n2 : --n3;
		System.out.println(result); //11
		//������Ԫ�����������ֵ
		int n4 = 55;
		int n5 = 33;
		int n6 = 123;
		int max1 = n4 > n5 ? n4 : n5;
		int max2 = max1 > n6 ? max1 : n6;
		System.out.println(max2); //123
		//һ�����ʵ�֣�
		int max = (n4 > n5 ? n4 : n5) > n6 ? (n4 > n5 ? n4 : n5) : n6;
		System.out.println(max); //123
		
	}
} 