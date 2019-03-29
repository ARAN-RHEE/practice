package step10_Exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = args[0];
		String data1 = args[1];  // 두 변수에 실행 매개값을 넘겨주지 않아서 예외 발생 
		
		System.out.println("args[0] : " + data);
		System.out.println("args[1] : " + data1 );
	}

}
