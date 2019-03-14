package step04;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score>=90) {  // 조건식이 참일 때 실행되는 부분. score는 85이므로 false임. 
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
			
		} else { // 조건식이 false일때 실행되는 실행문. 따라서 이 부분이 실행됨. 조건식이 true일 경우 else 전에 끝남.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
