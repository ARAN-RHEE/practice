package step03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput); //valueOf 메소드 :지정한 개체의 원시 값을 반환. 타입 변환. 
		// 변수 val 에 NaN이 담김. 
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { //val이 NaN인지 검사하는 메소드. val 이 NaN 일 경우 true -> if문 결과값 실행. 
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;  //val에 NaN이 담겼으므로 0.0으로 변환해줌. 
		}
		
		currentBalance += val ;
		System.out.println(currentBalance); // 따라서 최종 결과값은 currentBalance 에 0.0을 더한 값. 
	}

}
