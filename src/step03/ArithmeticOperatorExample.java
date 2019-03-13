package step03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4); // 5/2= 2.5이지만 result4를 int로 선언했으므로 소수점을 제외한 2가 담김.
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2;  // v1/v2를 더블타입으로 강제 캐스팅해 소수점까지 출력 가능!
		System.out.println("result6=" + result6);	
	}

}
