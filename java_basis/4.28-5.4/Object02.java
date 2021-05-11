public class Object02{
	public static void main(String[] args){
		int[][] map = {{1,2,3},{4,5,6},{7,8,9}};
		MyTools mt = new MyTools();
		// mt.printMap(map);
		mt.say();
	}
}

class MyTools{
	// public void printMap(int[][] arr){
		// for(int i = 0; i < arr.length; i++){
			// for(int j = 0; j < arr[i].length; j++){
				// System.out.print(arr[i][j] + " ");
			// }
			// System.out.print("\n");
		// }
		
	// }
	public void say(){
		B b = new B();
		b.print(2);
	}
	
}

class B{
	public void print(int n){
		System.out.print("n=" + n);
	}
}