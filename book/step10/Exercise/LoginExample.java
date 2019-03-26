package step10.Exercise;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");  // login메소드- 문자열이 일치하는지 비교. 일치하지 않는다면 catch블록 실행  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			login("blue","54321"); // login메소드- 문자열이 일치하는지 비교. 일치하지 않는다면 catch블록 실행  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception {
		//id가 blue가 아니라면 NotExistIDException 발생시킴 
		if(!id.equals("blue")) {
			throw new NotExistIDException("존재하는 아이디가 없습니다");  //문자열 파라미터를 메세지로 전달 
		}
		
		//password가 "12345"가 아니라면 WrongPasswordException을 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 일치하지 않습니다.");  //문자열 파라미터를 메세지로 전달 
		}
		

	}

}
