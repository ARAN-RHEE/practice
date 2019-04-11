package step14_Lambda;

import java.util.function.IntSupplier;

public class UsingLocalVarExample {
	public static int method(int x, int y) {
		IntSupplier supplier = ()-> {
		//컴파일 에러가 발생하는 이유
		//	x *= 10; // x의 값을 수정할 수 없음. 파라미터 x는 final의 특성을 갖기 때문 
		// 메소드 매개변수 또는 로컬변수를 사용할 때 해당됨. 
			int result = x+y;
			return result;
		};
		
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
}
