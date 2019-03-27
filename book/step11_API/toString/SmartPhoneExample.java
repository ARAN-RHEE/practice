package step11_API.toString;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		String strObj = myPhone.toString(); // 오버라이딩 한 toString()메소드의 결과값을 변수strObj에 담음
		System.out.println(strObj);   
		System.out.println(myPhone);  // myPhone.toString()을 자동 호출해서 리턴값을 얻은 후 출력 
		// println()메소드는 기본타입이 파라미터일 경우 값을 그대로 출력하고, 객체가 담긴다면 객체의 toString()메소드를 호출해서 리턴값을 받아 출력 
	}
}
