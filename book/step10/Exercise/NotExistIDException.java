package step10.Exercise;

public class NotExistIDException extends Exception{ 
	// 존재하지 않는 ID를 입력했을 경우 NotExistIDException을 발생시키고
	// 잘못된 패스워드를 입력했을 경우 WrongPasswordException 발생시키기. 
	public NotExistIDException() { }
	public NotExistIDException(String message) {
		super(message);  // 상위 클래스의 생성자를 호출하여 예외 메시지를 넘겨줌 
	//	System.out.println("ID가 존재하지 않습니다");
	}

}
