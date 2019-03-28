package step11_API.StringClass;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("신민철"); // new 연산자로 객체 생성. 이 문자열은 메모리의 힙 영역에 저장됨  
		String strVar2 = "신민철"; // 문자열 리터럴을 strVar2 에 저장. 이 문자열은 String constant pool에 저장됨 
		
		if(strVar1==strVar2) { // 둘은 다른 주소를 가지고 있음 
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		
		if(strVar1.equals(strVar2)) { //담겨있는 문자열은 같음 
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}

	}

}
