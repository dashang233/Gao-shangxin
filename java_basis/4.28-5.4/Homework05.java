import java.util.Scanner;
public class Homework05{
	public static void main(String[] args){
		//������ֵ������
		//����1
		// int[] arr1 = {10,12,45,90};
		// int[] arr2 = new int[arr1.length+1];
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("������Ҫ�����ֵ��");
		// int num = scanner.nextInt();
		// int count = -1; //��¼����λ��
		// for(int i = 0; i < arr1.length; i++){
			// if(arr1[i] <= num){
				// arr2[i] = arr1[i];
			// }else{
				// count = i; //��¼����λ��
				// arr2[i] = num;
				// break;
			// }
		// }
		// if(count == -1){ //num��arr1����Ԫ�ض���
			// arr2[arr1.length] = num;
		// }else{
			// for(int i = count; i < arr1.length; i++){
			// arr2[i+1] = arr1[i];
		// }
		// arr1 = arr2;
		// }
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//����2
		//1 ��λ
		// int[] arr1 = {10,12,45,90};
		// int num = 23; //��������
		// int count = -1; //��¼����λ��
		// for(int i = 0; i < arr1.length; i++){
			// if(arr1[i] > num){
				// count = i;
				// break;
			// }
		// }
		// if(count == -1){
			// count = arr1.length;
		// }
		// //2 ����
		// int[] arr2 = new int[arr1.length+1];
		// for(int i = 0, j = 0; i < arr2.length; i++){ //iһֱ�ӣ�j��ͣһ��
			// if(i != count){
				// arr2[i] = arr1[j];
				// j++; //����j��������i
			// }else{
				// arr2[i] = num;
			// }
		// }
		// arr1 = arr2; //����
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		
		//������飬�����ӡ,���������Сֵ
		// kint[] arr1 = new int[10];
		// int max = arr1[0];
		// int index = 0;
		// for(int i = 0; i < arr1.length; i++){
			// arr1[i] = (int)(Math.random()*100) + 1;
		// }
		// //����
		// for(int i = arr1.length-1; i >= 0; i--){
			// System.out.print(arr1[i]+" ");
		// }
		// System.out.print("\n");
		// for(int i = 0; i < arr1.length; i++){
			// System.out.print(arr1[i]+" ");
		// }
		// for(int i = 1; i < arr1.length; i++){
			// if(arr1[i] > max){
				// max = arr1[i];
				// index = i;
			// }
		// }
		// System.out.print("\n");
		// System.out.print("���ֵΪ��"+max+"���±�Ϊ��"+index);
		
		//ð������
		int[] arr1 = {24,69,80,57,13};
		int num = -1; //��ʱ��������
		int count = -1; //��¼��������
		for(int i = 0; i < arr1.length-1; i++){
			for(int j = 0; j < arr1.length-i-1; j++){
				if(arr1[j] > arr1[j+1]){
					num = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = num;
					count++;
				}
			}
			if(count == -1){
				break;
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		
		
	}
}