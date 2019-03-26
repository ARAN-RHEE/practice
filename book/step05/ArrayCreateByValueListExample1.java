package step05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]); //scores 배열의 0번 인덱스 값
		System.out.println("scores[1] : " + scores[1]); //scores 배열의 1번 인덱스 값 
		System.out.println("scores[2] : " + scores[2]); //scores 배열의 2번 인덱스 값
		
		int sum = 0; 
		for(int i = 0 ; i<3 ; i++) {//초기화식 : int i = 0 부터
									//조건식 : i<3 3을 포함하지 않는 정수.
									//1씩 증가하므로 0,1,2
			sum += scores[i];  
			//scores 배열의 0번 인덱스 값, 1번 인덱스 값, 2번 인덱스 값의 합을 sum에 저장
		}

		System.out.println("총합 : " + sum);
		double avg = (double) sum/3;   //sum이 int이므로 보다 정확한 값을 계산하기 위해 double로 형변환 
		System.out.println("평균 : " + avg);
		
	}

}
