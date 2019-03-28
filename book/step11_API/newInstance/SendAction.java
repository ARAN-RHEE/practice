package step11_API.newInstance;

public class SendAction implements Action { 
	@Override
	public void execute() { // 인터페이스에 선언되어있던 메소드 재정의 
		System.out.println("데이터를 보냅니다");
	}
}
