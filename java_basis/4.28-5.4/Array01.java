import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
		//��ƽ������
		//��������
		// double[] hens = {1,2,3,4,5,6};
		// //��������
		// double sum = 0;
		// for(int i = 0; i < hens.length; i++){ //�����±��0��ʼ����
			// // System.out.println("��"+(i+1)"");
			// sum += hens[i];
		// }
		// System.out.println("�ܺ�Ϊ��" + sum + "����ֵΪ��" + (sum /hens.length));
		
		//����ɼ�
		// double[] score;
		// score = new double[5];
		// Scanner scanner = new Scanner(System.in);
		// for(int i = 0; i < score.length; i++){
			// System.out.println("������"+(i+1)+"���ɼ�");
			// score[i] = scanner.nextDouble();
			
		// }
		// System.out.println(score);
		
		//exercise01
		// char[] letter = new char[26];
		// for(int i = 0; i < letter.length; i++){
			// letter[i] = (char)('A' + i); //�Ҳ�int���ͣ����char����Ҫǿת
		// }
		// for(int i = 0; i < letter.length; i++){
			// System.out.print(letter[i] + " ");
		// }
		
		//���������ֵ
		// int[] num = {4, -1, 9, 10, 23};
		// int max = num[0];
		// int id = 0;
		// for(int i = 1; i < num.length; i++){ //�ӵڶ���Ԫ�ؿ�ʼ
			// if(num[i] > max){
				// max = num[i];
				// id = i;
			// }
		// }
		// System.out.print("���ֵΪ"+max+"���±�Ϊ"+id);
		
		//���ø�ֵ
		// int[] arr1 = {1, 2, 3};
		// int[] arr2 = arr1;
		// arr2[0] = 10;
		// System.out.println("arr1Ԫ�أ�");
		// for(int i = 0; i < arr1.length; i++){ 
			 // System.out.print(arr1[i]+" ");
		// }
		
		//���鷴ת
		//����1
		// int[] arr1 = {11,22,33,44,55,66};
		// int[] arr2 = new int[arr1.length];
		// for(int i = 0, j = 5; i < arr1.length; i++, j--){
			// arr2[i] = arr1[j];
		// }
		// arr1 = arr2; //���ø�ֵ
		// for(int i = 0, j = 5; i < arr1.length; i++, j--){
			// System.out.print(arr1[i]+" ");
		// }
		
		//����2
		// int change = 0;
		// for(int i = 0; i < (arr1.length/2); i++){
			// change = arr1[i];
			// arr1[i] = arr1[arr1.length-i-1];
			// arr1[arr1.length-i-1] = change;
			
		// }
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//�������ݣ���̬��ӣ�
		// int[] arr1 = {1, 2, 3};
		// Scanner scanner = new Scanner(System.in);
		// while(true){
			// System.out.println("�Ƿ������ֵ, y/n ?");
			// char answer = scanner.next().charAt(0);
			// if(answer != 'y'){
				// break;
			// }
			// int[] arr2 = new int[arr1.length + 1];
			// for(int i = 0; i < arr1.length; i++){
				// arr2[i] = arr1[i];
			// }
			// System.out.println("������Ҫ��ӵ�����ֵ");
			// int num = scanner.nextInt();
			// arr2[arr2.length - 1] = num;
			// arr1 = arr2; //ָ��������
			// for(int i = 0; i < arr1.length; i++){
				// System.out.print(arr1[i]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//��������
		int[] arr1 = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		do{
			int[] arr2 = new int[arr1.length - 1];
			for(int i = 0; i < arr1.length-1; i++){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
			for(int i = 0; i < arr1.length; i++){
				System.out.print(arr1[i] + " ");
			}
			System.out.println("�Ƿ����������y/n ?");
			char answer = scanner.next().charAt(0);
			if(answer != 'y' || arr1.length==1){
				break;
			}
		}while(true);
		
		
		
		
		
		
		
	}
}