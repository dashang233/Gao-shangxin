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
		
		//��ϵ�����
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
	}
} 