import java.util.Scanner; //��ʾ����java.util�µ�Scanner��
public class Input{
	public static void main(String[] args){
		//�����û�����
		//1 ����Scanner���ڰ�����ʹ�����еİ���
		//2 ����ʵ��
		Scanner scanner = new Scanner(System.in);
		//3 �����û����룬ʹ����ط���
		System.out.println("����������");
		String name = scanner.next(); 
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("�����빤��");
		double sal = scanner.nextDouble();
		System.out.println("���֣�"+name+" ����:"+age+" нˮ:"+sal);
	}
}