package step11_API.Exercise;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		// 정규표현식
		String id = "5Angel1004";
		String regExp = "^[a-zA-Z][a-zA-Z0-9]{7,11}";
		// 첫 글자는 반드시 알파벳이 와야하고, 그 뒤에는 알파벳이나 숫자가 오면 됨.
		// 첫글자 제외하고 7~11자이므로 총 아이디 글자 수는 8~12자 이내여야 함
		boolean isMatch = Pattern.matches(regExp, id); // 정규표현식을 만족하는지 확인하는 메소드를 변수에 담아줌
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

	}

}
