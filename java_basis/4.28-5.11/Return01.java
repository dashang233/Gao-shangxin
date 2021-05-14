public class Return01{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			if(i == 3){
				return;
			}
			System.out.println(i);
		}
		
	}
}