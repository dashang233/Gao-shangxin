public class VarConvert{
	public static void main(String[] args){
		//�����Զ�ת��
		int num = 'a'; //��ȷ
		double d1 = 80; //��ȷ
		System.out.println(num); //97
		System.out.println(d1); //80.0
		
		int n1 = 10;
		//float d2 = n1 + 1.1; //����
		float d2 = n1 + 1.1F; //��ȷ
		byte b1 = 10; //��ȷ
		// byte b2 = n1; //����
		// char c1 = b1; //����
		
		byte b2 = 1;
		byte b3 = 1;
		short s1 = 1;
		int s2 = b2 + s1; //��ȷ���ұ�ת��ΪintȻ����м���
		// byte b4 = b2 + b3; //�����ұ�ת��ΪintȻ����м���
		
		//ǿ������ת��
		int n2 = (int)1.9;
		System.out.println("n2:" + n2); //1
		byte b5 = (byte)2000;
		System.out.println("b5:" + b5); //-48(���)
		
		//������������ת�ַ���
		int n3 = 100;
		String s3 = n3 + "";
		System.out.println(s3); //"100"
		//�ַ���ת������������
		String s4 = "123";
		int num1 = Integer.parseInt(s4);
		double num2 = Double.parseDouble(s4);
		boolean b6 = Boolean.parseBoolean("true");
		System.out.println(s4.charAt(0)); //'1'
	}
}