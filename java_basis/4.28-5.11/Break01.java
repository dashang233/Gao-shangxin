import java.util.Scanner;
public class Break01{
	public static void main(String[] args){
		//�������97����
		// int count = 0;
		// for(int i = 1; i <= 100; i++){
			// int ran = (int)(Math.random()*100) + 1;
			// // System.out.println(ran);
			// if(ran == 97){
				// break;
			// }
			// count++;
		// }
		// System.out.println("����"+count+"��");
		
		//���ֺ͵�һ�δ���20
		// int count = 0;
		// int sum = 0;
		// for(int i = 1; i <= 100; i++){
			// if(sum > 20){
				// break;
			// }
			// sum += i; //�ۻ�������if����
			// count++;
		// } 
		// System.out.println("��ǰ ��Ϊ��"+count);
		
		//��¼��֤
		Scanner scanner = new Scanner(System.in);
		String name = "";
		String password = "";
		for(int i = 1; i <= 3; i++){
			System.out.println("�������û���");
			name = scanner.next();
			System.out.println("����������");
			password = scanner.next();
			if("����".equals(name) && "666".equals(password)){
				System.out.println("��½�ɹ�");
				break;
			}
			System.out.println("������󣬻���" + (3-i) + "�λ���");
			
		}
	}
}