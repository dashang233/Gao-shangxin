public class Recursion01{
	public static void main(String[] args){
		T t = new T();
		// t.test(4);
		// int n1 = t.factorial(3);
		// System.out.println("n1= "+n1);
		
		// System.out.println(t.fb(6));
		
		// System.out.println(t.eat(1));
		
		//�Թ�����
		int[][] map = new int[8][7]; //8��7�е��Թ���0��ʾ�����ߣ�1��ʾ�ϰ���
		//�������桢����������Ϊ1
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		} 
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			} 
			System.out.print("\n");
		} 
		
	}
}

class T{
	public void test(int n){
		if(n>2){
			test(n-1); //ͬ���е���������� //�����ݹ�
		}
		System.out.println("n= "+n);
	}
	
	//�׳�
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return factorial(n-1) * n;
		}
	}
	
	//쳲���������
	public int fb(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return fb(n-1) + fb(n-2);
		}
	}
	
	//���ӳ�����(���Ʒ�)
	public int eat(int n){ //n��ʾ��n��
		if(n == 10){
			return 1;
		}else if(n >=1 && n <= 9){
			return 2 * (eat(n+1) +1); //ǰһ������=(��һ��������+1)*2
		}else{
			System.out.println("�������");
			return -1;
		}
	}
	
	//�Թ�����,ʹ�õݹ����˼��
	//map��ʾ�Թ���(i,j)��ʾ��ǰλ�ã�(1,1)Ϊ��ʼλ�ã�(6��5)�յ�
	//0�����ߣ�1���ϰ��� 2���߹������ԣ� 3���߹�������
	//map[6][5] = 2��ʾ�ҵ�ͨ·�ɽ�������������� 
	//��·���ԣ���������
	public boolean findWay(int[][] map, int i, int j){ 
		
	}
	
	
	
	
}

