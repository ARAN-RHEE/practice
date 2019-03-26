package step04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {  //int i = 1 : 초기화식
			// i<=10 : 조건식 
			// i ++ 증감식
			System.out.println(i);  //i를 출력. 
			//for문 안에서 선언된 i는 for문 블록 내부에서 사용하는 로컬변수이다.
		}
		
		/* for문 실행 순서. 1. 초기화식이 가장 먼저 실행된다.
		 * 2. 조건식을 평가해서 true이면 실행문이 실행되고, false이면 for문 블록을 실행하지 않고 끝난다.
		 * 3. 실행문들이 모두 실행되면 증감식을 실행시키고 다시 조건식을 평가한다. 조건식이 false일때까지 구동된다. 
		 * */
	}

}
