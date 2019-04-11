package step14_Lambda.API;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 매개값으로 <T> 객체를 가지므로 람다식도 한개의 변수 사용 
		Consumer<String> consumer = t->System.out.println(t+"8");
		consumer.accept("java");
		
		// 매개값으로 <T,U> 두 개의 객체를 가지므로 람다식도 두 개의 매개 변수 사용 
		BiConsumer<String,String> bigConsumer = (t,u)->System.out.println(t+u);
		bigConsumer.accept("Java", "8");
		
		// 매개값으로 double 하나를 가지므로 람다식도 한개의 매개변수 사용 
		DoubleConsumer doubleConsumer = d->System.out.println("Java"+d);
		doubleConsumer.accept(8.0);
		
		// 매개값으로 <T> 객체와 int 값 두 개를 가지기 때문에 람다식도 두 개의 매개 변수 사용. i는 고정적으로 int 타입임 
		ObjIntConsumer<String> objIntConsumer = (t,i)-> System.out.println(t+i);
		objIntConsumer.accept("Java", 8);
	}
}
