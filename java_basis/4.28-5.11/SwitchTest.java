import java.util.Scanner;
public class SwitchTest{
	public static void main(String[] args){
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������");
		// char c1 = scanner.next().charAt(0);
		// switch(c1){
			// case 'a':
				// System.out.println("����һ");
				// break;
			// case 'b':
				// System.out.println("���ڶ�");
				// break;
			// default:
				// System.out.println("����");
				// break; // ���޾���
		// }
		// System.out.println("�˳�Switch���򡣡���");
		
		// char c1 = 'a';
		// switch(c1){
			// case 'a':
				// System.out.println("����һ");
				// // break;
			// case 10:
				// System.out.println("���ڶ�");
				// break;
			// // default  // ���޾���
			
		//exercise01
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������a-e");
		// char c1 = scanner.next().charAt(0);
		// switch(c1){
			// case 'a':
			// System.out.println("A");
			// break;
			// case 'b':
			// System.out.println("B");
			// break;
			// default:
			// System.out.println("other");
			// break;
		// }
		
		//exercise02
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������ɼ�");
		// double d1 = scanner.nextDouble();
		
		// if(d1 >= 0 && d1 <= 100){
			// switch((int)(d1 / 60)){
				// case 1:
				// System.out.println("�ϸ�");
				// break;
				// case 0:
				// System.out.println("���ϸ�");
			// }
		// }else{
			// System.out.println("��������");	
		// }
		
		//exercise03
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·�");
		int num = scanner.nextInt();
		switch(num){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�������");
				break;
		}
		
	}
}