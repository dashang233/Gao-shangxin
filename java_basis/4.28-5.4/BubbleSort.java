public class BubbleSort{
	public static void main(String[] args){
		//ð������
		int[] arr1 = {24,69,80,57,13};
		// int[] arr1 = {1,2,3,4,5};
		int num = 0; //���ڸ��������ı���
		int count = 0; //��¼��������,�Ż��㷨������һ��һ�ζ���������ֱ���˳�
		for(int i = 0; i < arr1.length-1; i++){ //һ�������Ĵ�����
			for(int j = 0; j < arr1.length-i-1; j++){ //ÿ����(arr1.length-i-1)�Σ������𽥼���
				if(arr1[j] > arr1[j+1]){ //ע����j����i
					num =  arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = num;
					count++;
				}
			}
			if(count == 0){
				break;
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		
	}
}