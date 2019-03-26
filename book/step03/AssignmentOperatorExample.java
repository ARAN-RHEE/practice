package step03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		//대입연산자는 우측에 있는 피연산자 값을 좌측 피연산자 변수에 저장하는 것
		// 복합 대입 연산자는 변수와 우측 피연산자 연산을 먼저 수행한 뒤에 그 결과값을 좌측 변수에 저장하는 것. 
		int result = 0;
		result += 10;
		System.out.println(result);  
		
		result -= 5;
		System.out.println(result);  //동일한 변수명을 사용하므로 값이 계속 바뀜. 
		
		result *=3;
		System.out.println(result);
		
		result /= 5;
		System.out.println(result);  // 좌측 result 변수와 우측 피연산자 5 의 나누기 연산을 한 후 그 결과값을 변수 result에 저장 
		
		result %= 3;
		System.out.println(result);

	}

}
