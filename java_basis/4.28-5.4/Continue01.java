public class Continue01{
	public static void main(String[] args){
		// int i = 1;
		// while(i <= 4){
			// i++; //�������ifǰ�����������ѭ��
			// if(i == 2){
				// continue;
			// }
			// System.out.println("i=" + i);
			
		// }
		
		//�������ѭ��
		label1:
		for(int i = 0; i < 5; i++){
			label2:
			for(int j = 0; j < 5; j++){
				if(j == 2){
					continue label1; //�������ı���ѭ��
				}
				System.out.println("j = " + j);
			}
		}
		
	}
}