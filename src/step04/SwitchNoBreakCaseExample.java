package step04;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;  // 정수 0에서 3까지의 값 랜덤으로 출력 후에 8을 더해줌.
		// 즉 8~11 사이의 랜덤한 숫자가 산출된다. 
		System.out.println("[현재시간 : " + time + "시");

		switch(time) {
		// 연습해본 주사위 switch 문은 break가 있어서 랜덤한 숫자 산출 후 실행문이 실행되고 break로 switch 문이 종료된다.
		// 그러나 break가 없을 경우는 다음 case가 연달아서 진행된다.
		case 8 :
			System.out.println("출근합니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 본니다.");
		case 11 :
			System.out.println("외근을 나갑니다.");
			
		}
	}

}
