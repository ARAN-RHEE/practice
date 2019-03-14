package step04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		
		//조건식 3개를 이용한 실행 흐름. 
		if(score>=90) {  // 첫번째 조건. score가 90 이상일 때 실행. 이 조건은 false 임. 따라서 밑 else if를 따라감.
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");		
		} else if(score>=80) { // 두번째 조건. score이 80~89일때 실행. 이 조건도 마찬가지로 false 이므로 아래 else if를 따라감. 
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score>=70) { // 세번째 조건. score이 70~79일때 실행. 이 조건은 true 이므로 if문은 여기서 종료됨. 
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else { // 위 조건이 모두 false 일때 else문 실행. 
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}

}
