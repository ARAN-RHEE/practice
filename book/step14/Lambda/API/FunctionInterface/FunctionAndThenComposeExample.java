package step14.Lambda.API.FunctionInterface;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		// andThen, compose 모두  A인터페이스 실행 후 B 인터페이스 실행 
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member("홍길동","hong",new Address("한국","서울"))
				);
			System.out.println("거주 도시 : "+city);
		
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("홍길동","hong",new Address("한국","서울"))
				);
			System.out.println("거주 도시 : "+city);
		

	}

}
