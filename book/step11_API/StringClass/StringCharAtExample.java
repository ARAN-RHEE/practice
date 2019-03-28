package step11_API.StringClass;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 주민번호 뒷자리의 가장 앞자리로 성별 구분하기 
		String ssn = "010624-1234567";
		char sex = ssn.charAt(7); // 인덱스 7번, 즉 8번쨰 숫자가 주민번호 뒷자리의 가장 앞. 
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다");  // 1 또는 3일때 남자 출력. 
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다"); // 2 또는 4 일때 여자 출력 
			break;
		}

	}

}
