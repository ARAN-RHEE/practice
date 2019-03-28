package step11_API.StringTokenizer;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // StringBuilder 객체 생성 
		
		//문자열을 끝에 추가 
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		// 4번째 문자 뒤에 2 삽입 
		sb.insert(4, "2");
		System.out.println(sb.toString());

		//4번째 문자 뒤에6으로 변경 
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		// 6번째 문자 뒤부터 13번까지 문자까지를 "Book"으로 대치 
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5); //5번째 문자 삭제 
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString(); // buffer -> String 
		System.out.println(result);	
	}

}
