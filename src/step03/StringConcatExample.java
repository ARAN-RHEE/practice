package step03;

public class StringConcatExample {

	public static void main(String[] args) {
		// 문자열을 연결할 때는 + 연산자 사용.
		String str1 = "JDK" + 6.0;  // 피연산자 중 한쪽이 문자열이면 +연산자는 문자열 연결 연산자로 사용되어 다른 피연산자를 문자열로 변환함.
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;  // 연산식은 왼쪽에서부터 오른쪽으로 진행되기 때문에 문자열 연결 결과가 산출됨.
		String str4 = 3 + 3.0 + "JDK";  // 3+3.0이 먼저 연산되어 6.0이라는 실수값이 계산되고 그 후에 문자열 연결. 
		// 왼->오른쪽 순서로 계산. 
		System.out.println(str3);
		System.out.println(str4);
	}

}
