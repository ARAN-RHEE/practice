package step11_API.Format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name ="신용권";
		String tel = "010-123-4567";
		
		String text = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String result = MessageFormat.format(text, id,name,tel);
		// format()메소드에서 첫번째 파라미터는 매개 변수화된 문자열. 두번째 이후 파라미터는 인덱스 순서에 맞게 값을 적어주면 된다
		System.out.println(result);
		System.out.println();
		
		String sql="insert into member values({0},{1},{2})";
		Object[] arguments = {"'java'","'신용권'","'010-123-4567'"};
		String result2 = MessageFormat.format(sql, arguments);
		// 값 나열 대신 배열을 적어줘도 된다 
		System.out.println(result2);
				

	}

}
