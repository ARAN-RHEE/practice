package step14_Lambda.Reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new; // 생성자 참조 
		Member member = function1.apply("angel"); // 파라미터가 1개이므로 해당하는 생성자를 찾아서 참조함 
		
		BiFunction<String, String, Member> function2 = Member::new; // 생성자 참조 
		Member member2 = function2.apply("신천사", "angel"); // 파라미터가 2개이므로 해당하는 생성자를 찾아서 참조함 

	}

}
