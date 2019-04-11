package step14_Lambda.API.Operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	// 배열 선언 
	private static int[] scores= {92,95,87};
	// 메소드 선언. 매개변수로 IntBinaryOperator을 가지므로 메소드 호출시 람다식 사용 가능 
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0]; // result 변수를 scores 배열의 0번 인덱스로 초기화 하는 이유는..?? 
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin( // 메소드 호출할때 람다식을 파라미터로 이용 
		(a,b) -> {
			if(a>b) return a;
			else return b;
			}				
		);
		System.out.println("최대값 : " + max);
		
		//최소값 얻기
		int min = maxOrMin(
				(a,b)->{
					if(a<=b) return a;
					else return b;
				}
		);
		System.out.println("최소값 : " + min);		
	}
}
