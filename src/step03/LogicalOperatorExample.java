package step03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  charCode ='A';  //대문자 A는 유니코드 65값을 가짐  
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");    //유니코드 값이 65이므로 조건을 만족하기 때문에 결과값 실행됨. 
			//& 연산자는 두 연산식 모두가 참이어야 결과값 true. and 또는 합집합의 개념 
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");  // &&와 &의 차이는, &&의 경우 앞의 피연산자가 false이면 뒤의 연산자를
			//평가하지 않고 바로 false 산출 결과를 냄. &의 경우 앞 뒤 연산자 모두를 평가하기 때문에 &&이 좀 더 효율적으로 동작함. 
		}
		
		if((charCode < 48) && (charCode > 57)) {
			System.out.println("숫자 이군요");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0))	{
			System.out.println("2 또는 3의 배수 이군요");  // | 는 두 연산식 중 하나만 true 여도 결과값 true 산출. or, 교집합 개념 
			// | 역시 &와 마찬가지로 ||이면 앞 연산식 비교시 true면 뒤 연산식을 평가하지 않고 바로 true 산출. 
		}
		

		if((value%2==0) || (value%3==0))	{
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		}

}
