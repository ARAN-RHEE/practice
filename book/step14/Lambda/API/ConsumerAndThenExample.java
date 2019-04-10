package step14.Lambda.API;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		
		// Member의 이름 출력 
		Consumer<Member> consumerA = (m)->{
			System.out.println("consumerA : " + m.getName());
		};
		// Member의 id출력 
		Consumer<Member> consumerB = (m) ->{
			System.out.println("consumerB : "+ m.getId());
		};
		
		// Consumer의 andThen은 리턴값이 없으므로 함수적 인터페이스의 호출만 정함 
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동","hong",null));
	}
}
