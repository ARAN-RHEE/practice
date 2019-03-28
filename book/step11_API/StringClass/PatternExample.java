package step11_API.StringClass;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// 02 또는 012 - 숫자 3자리 또는 4자리 - 숫자 4자리 
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data); //정규표현식과 검증할 식이 일치하는 형식인지 체크 
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// 알파벳 1글자 이상 @ 알파벳 1글자 이상 . 알파벳 1글자 이상 (.알파벳1글자이상이 없거나 한번 더 올수있음)
 		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
