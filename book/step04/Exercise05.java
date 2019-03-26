package step04;

public class Exercise05 {

	public static void main(String[] args) {
		// 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y) 의 형태로 출력하기 
		// 단 x와 y는 10 이하의 자연수. 
		
		for(int x=1; x<=10; x++) { //문제에서 x는 1~10 범위 내의 자연수라고 하였으므로 for문으로 x는 1부터 10까지 증가하게 조건을 설정함.
			for(int y=2; y<=10; y++) { // y도 마찬가지로 1~10 범위 내의 자연수이므로 for문을 중첩해서 사용. 두 조건을 모두 만족해야함. 
				if(4*x + 5*y == 60) { //if문 안에 조건식이 true 일 때 아래 x와 y 값을 콘솔에 출력하는 실행문 작성.
					System.out.println("(" + x +"," + y + ")");
					
				}
			}
		}
		
	}

}
