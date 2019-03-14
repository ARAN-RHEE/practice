package step04;

public class IfDiceExample {

	public static void main(String[] args) {
		// 주사위 수 뽑기. 
		//Math.random() 함수는 0에서 1 사이의 double타입의 수를 하나 리턴한다. 
		// 따라서 1부터 6까지의 랜덤한 수를 뽑기 위해서는 int로 형변환 한 Math.random()*6+1 값을 가지면 된다.
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {  //랜덤으로 뽑은 수가 1일 때 조건을 충족하면 아래 실행문이 실행됨 
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) { //랜덤으로 뽑은 수가 2일 때 조건을 충족하면 아래 실행문이 실행됨
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) { //랜덤으로 뽑은 수가 3일 때 조건을 충족하면 아래 실행문이 실행됨
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) { //랜덤으로 뽑은 수가 4일 때 조건을 충족하면 아래 실행문이 실행됨
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) { //랜덤으로 뽑은 수가 5일 때 조건을 충족하면 아래 실행문이 실행됨
			System.out.println("5번이 나왔습니다.");
		} else { //랜덤으로 뽑은 수가 위 조건을 모두 만족하지 않을 때, 즉 6일 때 조건을 충족하면 아래 실행문이 실행됨
			System.out.println("6번이 나왔습니다.");
		}
	}

}
