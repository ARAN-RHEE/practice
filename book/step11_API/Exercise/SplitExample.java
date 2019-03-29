package step11_API.Exercise;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		// 방법1 (split()메소드 이용)
		String[] result = str.split(",");
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		//방법2 (StringTokenizer 이용)
		//문자열이 한 종류의 구분자로 연결되어 있을 때 이용하기 좋음 
		String str2 = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(str2,",");
		//문자열을 분리하기 위한 StringTokenizer 객체 생성. 파라미터로 문자열과 구분자를 넣어줌 
		int countTokens = st.countTokens();  // 토큰 갯수를 int 타입 변수에 담아주고 
		for(int i=0; i<countTokens;i++) { // 토큰 안에 담긴 분리된 문자열들을 모두 출력하기 위해 for문 실행 
			String token = st.nextToken(); // nextToken()메소드는 토큰을 하나씩 꺼내줌 
			System.out.println(token);//토큰 하나씩 출력 
		}
		

	}

}
