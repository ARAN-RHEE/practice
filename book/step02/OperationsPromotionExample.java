package step02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러 
		//자바는 정수 연산일 때 int 타입을 기본으로 하기 때문 
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;   //컴파일 에러 
		//char 타입의 연산 결과는 int 타입으로 산출됨. 
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 : " + intValue2);
		System.out.println("출력문자 : " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   //피연산자가 double이기 때문에 int 사용 불가능. 
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
