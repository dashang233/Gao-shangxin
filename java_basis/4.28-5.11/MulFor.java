import java.util.Scanner;
public class MulFor{
	public static void main(String[] args){
		// for(int i = 0; i < 2; i++){
			// for(int j = 0; j < 3; j++){
				// System.out.println("i=" + i + " j=" + j);
			// }
		// }
		
		//���ƽ���ɼ�
		// Scanner scanner = new Scanner(System.in);
		// double total = 0;
		// int num = 0; 
		// for(int i = 1; i <= 3; i++){
			// double sum = 0;
			// for(int j = 1; j <= 5; j++){
				// System.out.println("�������"+i+"�����"+j+"λͬѧ�ĳɼ���");
				// double score = scanner.nextDouble();
				// sum += score;
				// if(score >= 60){
					// num += 1;
				// }
			// }
			// System.out.println("�ܷ֣�"+sum+"��ƽ���֣�"+sum/5);
			// total += sum;
		// }
		// System.out.println("3����ƽ���֣�"+total/15+",����������"+num);
		
		//99�˷���
		// for(int i = 1; i <= 9; i++){
			// for(int j = 1; j <= i; j++){
				// System.out.print(i + "��" + j + "=" + i*j + "\t"); //ȥ��ln, �����Զ�����
			// }
			// System.out.println("\n");
		// }
		
		//���Ľ�����
		for(int i = 1; i <= 3; i++){
			for(int k = 1; k <= 3-i; k++){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++){
				if(j == 1 || j == 2*i-1 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(int i = 4; i <= 5; i++){
			for(int k = 1; k <= i-3; k++){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++){
				if(j == 1 || j == 11-2*i ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}