package step04;

public class IfNestedExample {

	public static void main(String[] args) {
		// 중첩 if문 
		int score = (int)(Math.random()*20)+81;  //0에서부터 19까지의 랜덤한 숫자를 산출하고, 81을 더해줌. 즉 score의 최솟값은 81. 
		System.out.println("점수 : " + score);
		
		String grade;  //grade 참조변수 선언. 
		
		
		// 중첩 if문. if문 안에 if문이 존재. 
		if(score>=90) {  //score이 90점 이상이라는 조건을 만족할 때 아래 중첩된 if문으로 흘러간다. 
			if(score>=95) {  // score이 90점 이상이면서  + 동시에 95점 이상일 때 아래 실행문이 실행됨. 조건이 2개임. 
				grade = "A+";
			} else {  // score이 90점 이상이지만, 95점 미만일 때. 즉 가장 먼저 사용한 if문의 조건은 충족하지만
				//중첩 if문의 조건을 충족하지 못했을 때 이 실행문이 실행됨. 
				grade = "A";
			}
		} else {  // score이 90점 이상이라는 첫번째 조건식을 만족하지 못했을 때 else문이 실행됨.
			if(score>=85) { //90점 미만이지만 중첩 if문의 조건인 85점 이상인 경우 아래 실행문이 실행됨.
				grade = "B+";
			} else { //가장 먼저 주어진 90점 이상의 조건식을 만족하지 못하고 else문으로 넘어왔을 때 또 다시 주어진 조건식 85점 이상을 만족하지
				//못했을 때(false) 아래 실행문이 실행됨.
				grade="B";
			}
		}
		
		
		System.out.println("학점 :" + grade);
	}

}
