public class Array02{
	public static void main(String[] args){
		//��ά����
		// int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		// for(int i = 0; i < arr1.length; i++){ //��������
			// for(int j = 0; j < arr1[i].length; j++){ //����ÿ��Ԫ��
				// System.out.print(arr1[i][j]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//������ȷ��
		// int[][] arr = new int[3][]; //ֻ������ά���飬û��ΪԪ�����鿪�ٿռ�
		// for(int i = 0; i < arr.length; i++){
			// //Ϊÿһ��һά���鿪�ٿռ�
			// arr[i] = new int[i+1];
			// for(int j = 0; j < arr[i].length; j++){
				// arr[i][j] = i+1;
			// }
		// }
		// for(int i = 0; i < arr.length; i++){
			// for(int j = 0; j < arr[i].length; j++){
				// System.out.print(arr[i][j]+" ");
			// }
			// System.out.print("\n");
		// }
		
		//������ά����
		// int[][] arr = {{4,6},{1,4,5,7},{-2}};
		// int sum = 0;
		// for(int i = 0; i < arr.length; i++){
			// for(int j = 0; j < arr[i].length; j++){
				// sum += arr[i][j];
			// }
		// }
		// System.out.print("�ܺ�Ϊ��"+sum);
		
		//�������
		int[][] arr = new int[10][];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];  //ÿһ��Ԫ��Ϊһ��һά����
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0 || j == (arr[i].length-1)){
					arr[i][j] = 1;
				}else{ //�ӵ����п�ʼ����ӹ���
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}