package step03;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // == 두 피연산자의 값이 같은지 검사
		boolean result2 = (num1 != num2); // != 두 피연산자가 다른지 검사 
		boolean result3 = (num1 <= num2); // <= 우측 피연산자가 좌측 피연산자보다 크거나 같은지 검사
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		char char1 = 'a';
		char char2 = 'b';
		boolean result4 = (char1 < char2);  //char타입은 유니코드 값을 비교
		System.out.println(result4);
		
		System.out.println(Integer.valueOf(char1));  //유니코드값 
		System.out.println(char2);

	}

}

