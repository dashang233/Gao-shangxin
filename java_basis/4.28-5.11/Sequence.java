import java.util.Scanner;
public class Sequence{
	public static void main(String[] args){
		//˳�����
		String[] names = {"����","����","����"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ƣ�");
		String name = scanner.next();
		int index = -1; //���ڱ�ʾ�Ƿ���ڲ��ҵ��ַ���
		for(int i = 0; i < names.length; i++){
			if(name.equals(names[i])){
				System.out.println("���ִ��ڣ��±�Ϊ��"+i);
				index = i;
				break;
			}
		}
		if(index == -1){
				System.out.println("�����ڲ��ҵ�����");
			}
	}
}