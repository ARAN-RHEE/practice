package step02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//작은 크기의 타입에서 큰 크기의 타입으로 자동 변환.
		byte byteValue = 10;
		int intValue = byteValue;  //byte -> int
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue; // char -> int
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;; // int -> long
		System.out.println(longValue);		
		
		intValue = 200;
		double doubleValue = intValue; //int -> double
		System.out.println(doubleValue);		
	}

}
