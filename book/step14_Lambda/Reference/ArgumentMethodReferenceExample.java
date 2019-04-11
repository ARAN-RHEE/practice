package step14_Lambda.Reference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
	public static void main(String[] args) {
		// ToIntBiFunction 함수적 인터페이스는 파라미터로 String타입 2개를 받고
		// int값을 리턴함 
		ToIntBiFunction<String,String> function;
		
		// compareToIgnoreCase()는 대소문자 상관없이 문자열을 비교해서
		// a가 b보다 먼저 오면 음수, 같으면 0, 나중에 오면 양수를 리턴함 
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if(order<0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if(order == 0) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}
}
