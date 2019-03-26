package step10;

public class BalanceInsufficiendException extends Exception{
	public BalanceInsufficiendException() { }  // 기본 생성자 
	public BalanceInsufficiendException(String message) {  // 에러 메세지를 전달하는 생성자
		super(message);
	}
}
 