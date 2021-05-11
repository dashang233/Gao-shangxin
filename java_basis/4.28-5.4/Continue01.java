public class Continue01{
	public static void main(String[] args){
		// int i = 1;
		// while(i <= 4){
			// i++; //必须放在if前，避免造成死循环
			// if(i == 2){
				// continue;
			// }
			// System.out.println("i=" + i);
			
		// }
		
		//跳过外层循环
		label1:
		for(int i = 0; i < 5; i++){
			label2:
			for(int j = 0; j < 5; j++){
				if(j == 2){
					continue label1; //跳出外层的本次循环
				}
				System.out.println("j = " + j);
			}
		}
		
	}
}