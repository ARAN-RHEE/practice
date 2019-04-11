package step14_Lambda.API.Operator;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		// minBy() 메소드는 두 값을 비교해서 작은 BinaryOperator<T>를 리턴함 
		binaryOperator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
		
		// maxBy() 메소드는 두 값을 비교해서 큰 BinaryOperator<T>를 리턴함 
		binaryOperator = BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}
