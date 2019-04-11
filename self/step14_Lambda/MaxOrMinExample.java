package step14_Lambda;

import java.util.function.IntBinaryOperator;

public class MaxOrMinExample {

	
		private static int[] scores = {10,50,3};
		
		// maxOrMin()메소드는 IntBinaryOperator 함수적 인터페이스를 파라미터로 가짐 
		// 메소드 호출 시 람다식 이용 가능 
		public static int maxOrMin(IntBinaryOperator operator) {
			int result = scores[0];
			for(int score : scores) {
				result = operator.applyAsInt(result, score);
			}
			return result;
		}
		
		public static void main(String[] args) {
		//최대값 얻기
			int max = maxOrMin(
				(a,b) -> {
					if (a>=b) return a;
					else return b;
				}	
			);
			System.out.println("최대값" + max);
			
			
			int min = maxOrMin(
				(a,b) -> {
					if( a<=b) return a;
					else return b;
				}	
			);
			
			System.out.println("최소값" + min);
	}

}
