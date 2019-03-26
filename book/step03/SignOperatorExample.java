package step03;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1); // +(-100)
		System.out.println("result2=" + result2); // -(-100)
		
		short s = 100;
		//short result3 = -s;  //컴파일 에러.
		//-s가 short 범위 내에 속해있다 하더라도 부호 연산자의 산출 타입은 int이기 때문.
		System.out.println(Short.MIN_VALUE+","+Short.MAX_VALUE);
		int result3 = -s; 
		System.out.println("result3=" + result3);
	}

}
