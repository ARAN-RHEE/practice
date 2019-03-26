package step03;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A'+1;
		char c2 = 'A';
		//char c3 = c2 + 1;
		System.out.println(c1);
		System.out.println(c2);
		//System.out.println(c3);
		/* c3이 컴파일 에러 나는 이유는 c1과 c2의 차이점에 있다.
		c1의 경우 자바는 리터럴 간의 연산은 타입 변환 없이 계산하기 때문에 
		char 타입의 'A' 문자의 유니코드 값에 1을 더한 값, 즉 'B' 문자의 유니코드 값이 담기지만 
		c3의 경우 변수c2가 연산하기 위해 int 타입으로 변환되지만 char타입으로 선언되었으로 산출이 불가능하다. 
		*
		*/
		

	}

}
