package step06;

public class Printer {
//문제16
//PrinterExample 클래스에서 Printer 객체를 생성하고 println() 메소드를 호출해서 매개값을 콘솔에 출력
//println() 메소드의 매개값으로는 int, boolean, double, String 값을 줄 수 있음. Printer 클래스에서 println() 메소드 선언하기
	

	
	//파라미터가 다양한 타입이기 때문에 메소드 오버로딩을 해준다. 
	public void println(int input) {
		System.out.println(input);
	}
	
	public void println(boolean input) {
		System.out.println(input);
	}
	
	public void println(double input) {
		System.out.println(input);
	}
	
	public void println(String input) {
		System.out.println(input);
	}
	
	
	
}
