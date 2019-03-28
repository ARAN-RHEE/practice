package step11_API.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동/이수홍/박연수";
		
		//how1: 전체 토큰 수를 얻어 for문으로 루핑
		// StringTokenizer 객체 생성 (파라미터로 문자열과 구분자 넣어줌) 
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //남아 있는 토큰의 수 
		for(int i=0; i<countTokens; i++) { //토큰이 남아있다면 토큰을 하나씩 꺼내오기 
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2: 남아 있는 토큰를 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/"); // StringTokenizer 객체 생성 (파라미터로 문자열과 구분자 넣어줌) 
		while( st.hasMoreTokens() ) {  //토큰이 남아있는지 확인 . 남아있다면 토큰 하나씩 꺼내오기 
			String token = st.nextToken();
			System.out.println(token);
		}

	}
}
