package step06;

public class Computer {
	// 매개 변수의 수를 모를 경우. 

	int sum1(int[] values) {  //파라미터가 배열타입 
		int sum=0;
		for(int i=0; i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //파라미터가 배열 타입. ... 사용 
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
 // 두 메소드는 처리 내용이 같다 
}
