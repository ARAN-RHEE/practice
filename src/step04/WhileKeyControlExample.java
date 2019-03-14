package step04;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0; 
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {  // 키코드 13과 10은 엔터키. 엔터키가 입력되지 않을 때 if문 안의 실행문이 실행됨
				System.out.println("----------------------");
				System.out.println("1. 증속 | 2. 감속  | 3. 중지");
				System.out.println("----------------------");
				System.out.println("선택  : ");
			}
			
			keyCode = System.in.read();  //키보드의 키 코드를 읽음. 메인 메소드에 붙어있는 throws Exception은 
			// system.in.read() 메소드에 대한 예외 처리 코드이다. 
			
			if(keyCode == 49) { // 키보드 입력값 1을 읽었을 경우
				speed++;  //1 증가시킴 
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode ==50) { // 키보드 입력값 2를 읽었을 경우 
				speed--; //1 감소시킴. 증감연산자가 뒤에 붙었을 경우 모든 연산이 끝난 뒤에 증감 
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode ==51) {  // 키보드 입력값 3을 읽었을 경우 
				run = false; // 키보드 3 을 입력했을때 run 변수에 false 값을 넣어줌. while문을 종료시키기 위함. 
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
