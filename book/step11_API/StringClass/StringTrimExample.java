package step11_API.StringClass;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trim()메소드는 앞 뒤 공백을 제거한 새로운 문자열을 생성해서 리턴한다
		//기존 문자열이 바뀌는것이 아님 
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
