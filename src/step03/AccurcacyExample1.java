package step03;

public class AccurcacyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit; 
		// int 와 double의 복합 계산일 경우 
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다."); 
		//결과값이 0.3이 아닌 0.29999999993dl 되어 정확히 0.3이 되지 않는다. 소수점의 계산 방식이 약간 다르기 때문이다. 
		//부동 소수점 타입은 0.1을 정확히 표현할 수 없어 근사치로 처리한다. 
	
	}

}
