package step03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C' );
		// 조건식 score이 90 이상이면, 결과는 피연산자2 - 'A'
		// 90 미만 80초과라면 다음 삼항연산식의 피연산자 2 - 'B'
		// 두 조건을 다 만족하지 않는다면 피연산자3 - 'C'
	
		System.out.println(score + "점은 " + grade + "등급입니다");

	}

}