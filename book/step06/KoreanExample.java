package step06;

public class KoreanExample {

	public static void main(String[] args) {
		// 박자바 = 파라미터 n, name 필드의 초기값
		// 011~ = 파라미터 s, ssn 필드의 초기값 
		// 생성자로 초기값 주는 방법 
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		
		// 김자바 = 파라미터 n, name 필드의 초기값
		// 930~ = 파라미터 s, ssn필드의 초기값
		// 생성자로 초기값 주는 방법. 
		Korean k2 = new Korean("김자바", "930210-1231234");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);	
	}

}
