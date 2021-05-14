public class Homework07{
	public static void main(String[] args){
		// 01
		// double[] d1 = {1.1,2.3};
		// A01 a = new A01();
		// Double res = a.max(d1);
		// if(res != null){
			// System.out.println("最大值为：" + res);
		// }else{
			// System.out.println("输入有误");
		// }
		
		
		//02
		// int[] arr2 = {1,2,3};
		// A02 a2 = new A02();
		// int index = a2.find(arr2, 2);
		// if(index != -1){
			// System.out.println("元素索引为" + index);
			
		// }else{
			// System.out.println("数组中没有该元素");
		// }
		
		//03
		
	}
}

//01 求数组最大值（考虑数组没有元素的情况）
class A01{
	
	public Double max(double[] d){ //返回一个对象
		if(d!= null && d.length>0){
			double num = d[0];
			for(int i = 1; i < d.length; i++){
				if(num < d[i]){
					num = d[i];	
				}
			}
			return num;
		}else{
			return null; //null可作为对象返回给Doube包装类
		}
	}
}

//02 查找数组元素并返回索引
class A02{
	public int find(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				System.out.println("找到元素");
				return i;
			}
		}
		return -1;
	}
}





