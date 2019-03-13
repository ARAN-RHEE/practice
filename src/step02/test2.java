package step02;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		System.out.println(intValue); // 10은 int, byte 가 표현할 수 있는 범위 내의 수이므로 변동없이 출력됨. 
		
		int intValue2 = charValue;
		System.out.println(intValue2); //'A'의 유니코드 숫자값이 intValue2에 담김.
		
		
		

	}

}
