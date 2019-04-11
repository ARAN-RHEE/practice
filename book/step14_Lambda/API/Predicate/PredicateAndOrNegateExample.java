package step14_Lambda.API.Predicate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate predicateA = a->a%2==0;
		
		//3의 배수 검사
		IntPredicate predicateB = b->b%3==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		
		//and()
		predicateAB = predicateA.and(predicateB); // A&&B 
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?"+result);
		
		//or()
		predicateAB = predicateA.or(predicateB); //A||B
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까?"+result);
		
		//negate()
		predicateAB = predicateA.negate(); // !A
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까?"+result);

	}

}
