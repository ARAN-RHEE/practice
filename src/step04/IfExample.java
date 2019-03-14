package step04;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		//if문의 실행문 중괄호 유무 차이. 
		
		if(score>=90) {  //주어진 조건식이 참일때 실행됨. score은 93이므로, 90보다 크거나 같고 true. 
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다.");
		}  // 중괄호 안 모든 실행문이 실행됨. 
		
		if(score<90) 
			System.out.println("점수가 90보다 작습니다");  //중괄호로 묶이지 않은 실행문.
			System.out.println("등급은 B 입니다"); /* 중괄호로 실행문을 묶지 않을 경우 조건식 바로 다음에 나오는 실행문만 
			 참일때 실행. 따라서 등급은B입니다 라는 출력문이 점수와 상관 없이 단독으로 실행됨. */ 
		
	}

}
