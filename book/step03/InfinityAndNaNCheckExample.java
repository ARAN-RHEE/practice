package step03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		// % 연산자의 경우 좌측 피연산자가 정수 타입일 때, 우측 피연산자는 0을 사용할 수 없다. 컴파일은 정상적으로 되지만 실행시 예외가 발생한다. 
		// ArithmeticException
		// 실수타입인 0.0 (double) 또는 0.0f(float)으로 나누면 예외가 발생하지 않고 연산의 결과는 무한대 값을 가지며
		// 연산 결과는 NaN(Not a Number)를 가진다. 
		
		
		
		System.out.println(Double.isInfinite(z)); //double 타입의 값이 infinite 이면 true 리턴하는 메소드
		System.out.println(Double.isNaN(z)); //double 타입의 값이 nan이면 true를 리턴하는 메소드 
		
		System.out.println(z + 2);
		
		// 보통 연산 결과가 infinity 또는 NaN이 나오면 이 값과 연산헀을 때 데이터가 엉망이 될 수 있으므로 보통 if문을 사용해 연산을 수행하지 못하도록
		// 실행 흐름을 변경해야 한다. 
		
	}

}
