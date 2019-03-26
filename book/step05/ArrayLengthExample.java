package step05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 83, 90, 87 }; //int[] 타입의 배열scores 선언.
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //배열변수.length = 배열의 길이를 얻을 수 있음. 배열에 저장할 수 있는
			//전체 항목 수. 데이터 갯수. 위 배열에서는 3. 
			// for문 조건식에서 <=가 아닌 < 연산자를 사용한 이유는 마지막 인덱스는 배열의 길이보다 하나 작기 떄문임.
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
