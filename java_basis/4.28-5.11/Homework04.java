import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		//01 ��·��
		// double left = 100000; //ʣ�����Ǯ
		// int count = 0; //�����·�ڸ���
		// while(true){ //��ѭ��
			// if(left > 50000 ){
				// left *= 0.95;
				// count++;
			// }else if(left >= 1000){
				// left -= 1000;
				// count++;
			// }else{
				// break;
			// }
		// }
		// System.out.println("��"+ count + "�ξ���·��");
		
		//02 �ж�������Χ
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������һ������");
		// int num = scanner.nextInt();
		// if(num > 0){
			// System.out.println("������");
		// }else if(num < 0){
			// System.out.println("������");
		// }else{
			// System.out.println("0");
		// }
		
		// 03�ж��Ƿ�Ϊˮ�ɻ���
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������һ����λ����");
		// int num = scanner.nextInt();
		// int n1 = num / 100;
		// int n2 = num % 100 / 10;
		// int n3 = num % 10;
		// if(num == (Math.pow(n1, 3)+Math.pow(n2, 3)+Math.pow(n3, 3))){
			// System.out.println("������һ��ˮ�ɻ���");
		// }else{
			// System.out.println("����Ĳ���ˮ�ɻ���");
		// }
		
		//04 ���ܱ�5������5��һ��
		// int count = 0;
		// for(int i = 1; i <= 100; i++){
			// if(i % 5 != 0){
				// System.out.print(i + "\t");
				// count++;
				// if(count % 5 == 0){ //�ڲ�ifд������������пո�
					// System.out.print("\n");
				// }
			// }
		// }
		
		//05 ���a-z��Z-A
		// for(char i = 'a'; i <= 'z'; i++){
			// System.out.print(i + " ");
		// }
		// System.out.print("\n");
		// for(char j = 'Z'; j >= 'A'; j--){
			// System.out.print(j + " ");
		// }
		
		//�������
		// double sum = 0;
		// for(double i = 1; i <= 100; i++){
			// sum += Math.pow(-1, i + 1) * 1/i ;
		// }
		// System.out.print(sum);
		
		//�������
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 100; i++){
			sum1 += i;
			sum2 += sum1;
		}
		System.out.print(sum2);
		
	}
}