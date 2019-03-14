package step05;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		//향상된 for문. 
		for (int score : scores) { 
			//for(타입변수:배열){
			// 실행문 
			// }
			// 배열에서 꺼낸 항목을 저장할 변수를 선언하고 : 작성 후 배열을 나란히 작성.
			// for문이 실행될 때 배열에서 가져올 첫번째 값이 존재하는지 평가. 
			// 가져올 값이 존재하면 해당 값을 변수에 저장 후 실행문 실행.
			// 실행문이 모두 실행되면 다시 루프를 돌아 배열에서 가져올 다음 값이 존재하는지 평가.
			// 가져올 항목이 없으면 for문 종료. 
			// for문의 반복 횟수는 배열의 항목 횟수. 
			sum = sum + score;
		}  // score 변수에 scores 배열의 값 모두 더함. 
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
