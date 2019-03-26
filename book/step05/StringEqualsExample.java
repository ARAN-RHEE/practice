package step05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같음");  //string 객체의 경우 문자열 리터럴이 같으면 같은 주소를 참조함.
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");  // equals로 문자열을 비교해도 같음 
		} 
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철"); 
		
		if(strVar3 == strVar4) {  //그러나 new연산자로 string객체를 생성한 경우, "신민철"객체의 문자열은 같지만
			// 신민철 object가 값으로 저장되고, new 연산자로 한번 더 생성되기 때문에 둘의 주소값 = 참조가 다름. 
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {  //참조가 다르지만 문자열은 같기 때문에 equals 로 문자열 비교시 true 
			System.out.println("strVar3 과 strVar4 는 문자열이 같음");
		}
	}

}
