public class Recursion01{
	public static void main(String[] args){
		T t = new T();
		// t.test(4);
		// int n1 = t.factorial(3);
		// System.out.println("n1= "+n1);
		
		// System.out.println(t.fb(6));
		
		// System.out.println(t.eat(1));
		
		//迷宫问题
		int[][] map = new int[8][7]; //8行7列的迷宫，0表示可以走，1表示障碍物
		//将最上面、下面两行设为1
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
			test(n-1); //同类中调用无需对象 //产生递归
		}
		System.out.println("n= "+n);
	}
	
	//阶乘
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return factorial(n-1) * n;
		}
	}
	
	//斐波那契数列
	public int fb(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return fb(n-1) + fb(n-2);
		}
	}
	
	//猴子吃桃子(逆推法)
	public int eat(int n){ //n表示第n天
		if(n == 10){
			return 1;
		}else if(n >=1 && n <= 9){
			return 2 * (eat(n+1) +1); //前一天桃子=(后一天桃子数+1)*2
		}else{
			System.out.println("输入错误");
			return -1;
		}
	}
	
	//迷宫问题,使用递归回溯思想
	//map表示迷宫，(i,j)表示当前位置，(1,1)为初始位置，(6，5)终点
	//0：可走；1：障碍； 2：走过，可以； 3：走过，不可
	//map[6][5] = 2表示找到通路可结束，否则继续找 
	//找路策略：下右上左
	public boolean findWay(int[][] map, int i, int j){ 
		
	}
	
	
	
	
}

