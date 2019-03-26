package step02;

public class test1 {
	public static void main(String[] args) {
		int value = 10;
		int result = value + 10;
		System.out.println(result);
		
		int intValue = 102000000;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue); //byte 범위를 넘어선 값이 저장될 경우 다시 돌아감.
		System.out.println(Double.MAX_VALUE); //double 타입의 최대값. 
		System.out.println(Byte.MAX_VALUE); //byte타입의 최대값. 
		
	}
}
