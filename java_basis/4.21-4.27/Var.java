public class Var{
	public static void main(String[] args){
		//���ԼӺ�
		int age = 20;
		double score = 89.1;
		char gender = '��';
		String name = "����";
		System.out.println(age + score);
		System.out.println(age + name);
		
		//����
		int n1 = 1;
		// long n2 = 1L; //����
		long n2 = 1L; //��ֵĬ��int�����ں����L
		
		//������
		float n3 = 1.2F;
		 
		//�ַ���
		char c1 = 100; //������ִ�����ַ���������
		char c2 = '��';
		System.out.println(c1);
		System.out.println(c2);
		char c3 = 97;
		System.out.println(c3); //��� a
		char c4 = 'a';
		System.out.println((int)c4); //���97  
		System.out.println('a' + 10); //���107
		
		//������
		boolean isPass = true;
		if(isPass = true){
			System.out.println("����ͨ������ϲ��");
		}else{
			System.out.println("û��ͨ��������Ŭ��~");
		}
		
	}
}