import java.util.Scanner;
public class IfElse{
	public static void main(String[] args){
		// System.out.println("����������");
		// Scanner scanner = new Scanner(System.in);
		// int age = scanner.nextInt();
		// if(age > 18){
			// System.out.println("�����湤��");
		// }else{
			// System.out.println("��ú�ѧϰ");
		// }
		
		// double d1 = 10.1;
		// double d2 = 12.3;
		// if((d1 > 10) && (d2 < 20) ){
			// System.out.println(d1 + d2);
		// }
		// int n1 = 10;
		// int n2 = 5;
		// int sum = n1 + n2;
		// if(sum % 3 == 0 && sum % 5 == 0){
			// System.out.println("�ɱ�3��5����");
		// }else{
			// System.out.println("���ɱ�3��5����");
		// }
		
		//���֧
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("���������û���");
		// int score = scanner.nextInt();
		// if(score >= 1 && score <=100){
			// if(score == 100){
				// System.out.println("���ü���");
			// }else if(score > 80 && score <= 99){
				// System.out.println("��������");
			// }else if(score >= 60 && score <= 80){
				// System.out.println("����һ��");
			// }else{
				// System.out.println("���ò�����");
			// }
		// }else{
			// System.out.println("�������");
		// }
		
		//Ƕ�׷�֧
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("������ɼ���");
		// double score = scanner.nextDouble();
		
		// if(score >= 8.0){
			// System.out.println("��ϲ�������������");
			// System.out.println("�������Ա�");
			// char gender = scanner.next().charAt(0);
			// if(gender == '��'){
				// System.out.println("���������顣");
			// }else{
				// System.out.println("����Ů���顣");
			// }
		// }else{
			// System.out.println("���ź����ٽ�������");
		// }
		
		//Ƕ�׷�֧ ��ӡƱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("�����뼾��");
		String season = scanner.next();
		if(season.equals("����")){
			if(age >= 18 && age <= 60){
				System.out.println("Ʊ��60");
			}else if(age < 18){
				System.out.println("Ʊ��30");
			}else{
				System.out.println("Ʊ��20");
			}
			
		}else{
			if(age >= 18 && age <= 60){
				System.out.println("Ʊ��40");
			}else{
				System.out.println("Ʊ��20");
			}
		}
	}
}