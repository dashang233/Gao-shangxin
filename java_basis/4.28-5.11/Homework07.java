public class Homework07{
	public static void main(String[] args){
		// 01
		// double[] d1 = {1.1,2.3};
		// A01 a = new A01();
		// Double res = a.max(d1);
		// if(res != null){
			// System.out.println("���ֵΪ��" + res);
		// }else{
			// System.out.println("��������");
		// }
		
		
		//02
		// int[] arr2 = {1,2,3};
		// A02 a2 = new A02();
		// int index = a2.find(arr2, 2);
		// if(index != -1){
			// System.out.println("Ԫ������Ϊ" + index);
			
		// }else{
			// System.out.println("������û�и�Ԫ��");
		// }
		
		//03
		
	}
}

//01 ���������ֵ����������û��Ԫ�ص������
class A01{
	
	public Double max(double[] d){ //����һ������
		if(d!= null && d.length>0){
			double num = d[0];
			for(int i = 1; i < d.length; i++){
				if(num < d[i]){
					num = d[i];	
				}
			}
			return num;
		}else{
			return null; //null����Ϊ���󷵻ظ�Doube��װ��
		}
	}
}

//02 ��������Ԫ�ز���������
class A02{
	public int find(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				System.out.println("�ҵ�Ԫ��");
				return i;
			}
		}
		return -1;
	}
}





