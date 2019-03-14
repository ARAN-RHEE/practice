package step03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);  // 자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어있음
		System.out.println(strVar1 == strVar3); // 그러나 new로 생성한 새로운 String 객체는 번지수가 다름 
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //문자열만을 비교하려면 == 대신에 equals 사용.
		System.out.println(strVar1.equals(strVar3)); // 번지수가 달라도 문자열은 같으므로 결과값 true 산출. 
	}

}
