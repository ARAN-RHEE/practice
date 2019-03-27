package step11_API.NullCheck;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		// 메소드 오버로딩해서 파라미터를 다르게 주고 있음 
		try {
			String name=Objects.requireNonNull(str2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다"); // 예외 메세지가 파라미터로, 그 메세지를 출력해줌 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()-> "이름이 없다니까요");  //람다식 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
