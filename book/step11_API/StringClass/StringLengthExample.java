package step11_API.StringClass;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length(); // 문자열의 길이 리턴하는 메소드 length() 호출
		if(length==13) {
			System.out.println("주민번호 자리수가 맞습니다");
		} else {
			System.out.println("주민번호 자리수가 틀립니다");
		}

	}

}
