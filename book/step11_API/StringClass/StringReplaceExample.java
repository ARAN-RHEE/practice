package step11_API.StringClass;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");  // 첫번째 파라미터 문자열을 두번째 파라미터로 바꿔주는 메소드 replace 호출 
		System.out.println(oldStr);
		System.out.println(newStr);
				

	}

}
