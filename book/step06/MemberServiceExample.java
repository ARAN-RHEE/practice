package step06;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberService(); //MemberService 메소드를 사용하기 위해 객체 생성 
		
		boolean result = memberService.login("hong", "12345");
		if(result) {  // login 메소드에서 id 파라미터 값이 hong이고 pw 파라미터 값이 12345 일때 true를 리턴하라고 했으므로 조건 만족 
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");  // logout메소드 호출 
		} else {  //조건을 만족하지 않을 때 
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
