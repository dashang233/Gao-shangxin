import java.util.Scanner;
public class Sequence{
	public static void main(String[] args){
		//顺序查找
		String[] names = {"张三","李四","王五"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名称：");
		String name = scanner.next();
		int index = -1; //用于表示是否存在查找的字符串
		for(int i = 0; i < names.length; i++){
			if(name.equals(names[i])){
				System.out.println("名字存在，下标为："+i);
				index = i;
				break;
			}
		}
		if(index == -1){
				System.out.println("不存在查找的名字");
			}
	}
}