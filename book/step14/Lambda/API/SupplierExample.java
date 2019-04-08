package step14.Lambda.API;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		// 파라미터는 없고 int값을 리턴- IntSupplier인터페이스 구현하는 람다식  선언 
		IntSupplier  intSupplier = ()->{
			int num = (int) (Math.random()*6)+1;
			return num; // 파라미터 없어서 (). 
		};
		
		int num = intSupplier.getAsInt(); // IntSupplier 인터페이스의 추상메소드 getAsInt. int값을 리턴해줌 
		System.out.println("눈의 수 : "+num);
	}
}
