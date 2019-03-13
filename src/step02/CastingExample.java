package step02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		//44032->char타입 변환->"가" 출력.
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);  //500은 int의 범위 내에 있으므로 손실 없이 변환됨. 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	//int로 강제 변환 되므로 소수점 .14 삭제됨 
	}

}
