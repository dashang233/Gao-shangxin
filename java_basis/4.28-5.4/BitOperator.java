public class BitOperator{
	public static void main(String[] args){
		//2的原码：00000000 00000000 00000000 00000010(正数三码合一)
		//3的原码：00000000 00000000 00000000 00000011
		System.out.println(2&3); //2
		//-2原码：10000000 00000000 00000000 00000010
		//-2补码：11111111 11111111 11111111 11111110
		//运算后补码：00000000 00000000 00000000 00000001（正数三码合一）
		System.out.println(~-2); //1
		System.out.println(1 >> 1); //0
		System.out.println(1 << 2); //4
	}
}