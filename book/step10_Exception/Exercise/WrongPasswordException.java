package step10_Exception.Exercise;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {  }
	public WrongPasswordException(String message) {
		super(message); // 상위 클래스의 생성자를 호출하여 예외 메시지를 넘겨줌 
	//	System.out.println("패스워드가 틀립니다.");
	}
}
