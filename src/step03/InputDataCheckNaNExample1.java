package step03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// 실수를 입력받을 때는 반드시 NaN 검사를 해야 한다. 
		String userInput = "NaN";
		double val = Double.valueOf(userInput); //userInput 변수에는 String객체 NaN이 참조되었으나 double타입으로 변환됨. 
		
		double currentBalance = 10000.0;
		
		currentBalance += val;  // currentBalance에 NaN이 저장됨.
		System.out.println(currentBalance);
		//val에는 NaN이 담겼고, NaN은 산술연산이 가능하므로 currentBalance의 결과값은 NaN이 산출된다. 이로 인해 데이터가 엉망이 되므로
		//이를 방지하고자 사용자로부터 문자열을 입력받을 때에는 반드시 "NaN"인지를 조사하고 만약 "NaN"이라면 산술연산을 수행해서는 안된다.
		//if문 사용하는 것이 적합할 듯 함. 
		
	}

}
