package step03;

public class AccurayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number; 
		
		double result = temp/10.0; //앞서 본 바와 같이 float, double은 0.1을 정확히 표현할 수 없어 정수연산으로 변경 후에 계산해야 한다. 
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면 ");
		System.out.println(result + " 조각이 남는다.");
	
	
	}

	
	
}
