package step06;

public class MemberService {
	
// login() 메소드와 logout() 메소드 선언 
// login() 메소드 호출 시 매개값으로 id, password 제공
// logout() 메소드는 id만 매개값으로 제공 
	
	String idCheck = "hong";
	String pwCheck = "12345";
	
	public boolean login(String id, String password) {
		if(idCheck.equals(id) && pwCheck.equals(password)) {  // id가 "hong", password가 "12345" 일 경우에만 
			// true로 리턴하고 그 이외의 값일 경우에는 false
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}
