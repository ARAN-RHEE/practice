package step03;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		
		// 삼항연산자 - 조건식이 참일때 피연산자2 "가" 결과값 출력, false일때 피연산자3 "나" 출력. 
		// 조건이 score이 90 이상인 것의 ! 이므로, !(false) = true
		
		System.out.println(result);

	}

}
