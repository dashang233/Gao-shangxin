public class OverLoad01{
	public static void main(String[] args){
		MyCalculator cal = new MyCalculator();
		int n1 = cal.calculate(1,2);
		double d1 = cal.calculate(1,2.1);
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(Math.pow(3,3));
		System.out.println(cal.calculate(1.1,1.2));
		
		//�ɱ����
		System.out.println(cal.sum(1,2,3));
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		System.out.println(cal.sum(arr1));
		
		// double[] scores = {1.1,2.2,3.3};
		// System.out.println(cal.scores("Tom", 1.2, 2.3));
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		cal.printNum(num);
	}
}

class MyCalculator{
	//��������
	public int calculate(int n1, int n2){
		return n1 + n2;
	}
	public double calculate(int n1, double n2){
		return n1 + n2;
	}
	public double calculate(double n1, double n2){
		return n1 > n2 ? n1 : n2;
	}
	
	//�ɱ���� 
	public int sum(int... nums){ //nums�൱��һ������
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
	//�����������ɼ�
	public String scores(String name, double... score){
		double sum = 0;
		for(int i = 0; i < score.length;i++){
			sum += score[i];
		}
		return name + "��ƽ���ɼ�Ϊ��" + sum/score.length;
	}
	
	public void printNum(int[]... num){ //�൱�ڴ���һ����ά���� int[][]
		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num[i].length; j++){
				System.out.print(num[i][j]);
			}
		}
	}
	
}


