package step05;

public class test3 {
	public static void main(String[] args) {
		
		String abc = "abc"; //문자열 리터럴로 String 객체 생성
		String abc1 = "abc"; // 문자열 리터럴로 String 객체 생성
		String abc2 = new String("abc"); // new 연산자로 String 객체 생성
		
		if(abc==abc1) { //문자열 리터럴로 객체를 생성한 경우, 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어있음.
						// abc와 abc1은 같은 주소를 가지고 있다.
			System.out.println("1. true");
		} else {
			System.out.println("1. false");
		}
		
		
		if(abc == abc2) { // new 연산자를 사용해서 String 객체를 생성했을 경우 객체가 별도로 생성된 것이기 때문에 주소값이 다름.
			System.out.println("2. true");
		} else {
			System.out.println("2. false");
		}
		
		//동일한 String 객체이건 다른 String 객체이건 상관없이 문자열만 비교할 때에는 String객체의 equals() 메소드를 사용하면 됨.
		System.out.println("3. " + abc2.equals(abc));
		System.out.println("3. " + abc2.equals(abc1));
	}
}
