package step14_Lambda.Reference;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조 
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));

		operator = Calculator :: staticMethod;
		System.out.println("결과2: " +  operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조 
		Calculator obj = new Calculator(); //인스턴스 메소드이기때문에 객체 생성 
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));

		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}
