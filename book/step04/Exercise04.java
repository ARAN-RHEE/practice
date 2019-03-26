package step04;

public class Exercise04 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추게 하는 코드 작성하기.
		
	//주사위를 계속 돌려 랜덤한 수를 담아야 하므로, 두 주사위 값을 while문 안에서 선언해 주사위 굴리는 것을 반복하게 한다. 
		
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;  // a는 1~6 사이 랜덤한 수
			int dice2 = (int)(Math.random()*6)+1; // b 는 1~6 사이 랜덤한 수
			System.out.println("(" + dice1 + "," + dice2 + ")");  //주사위 값 콘솔에 출력
			if(dice1+dice2==5) // 두 주사위 눈의 합이 5일때 while 문 종료 
				break;
			
			
		}
				

	}

}
