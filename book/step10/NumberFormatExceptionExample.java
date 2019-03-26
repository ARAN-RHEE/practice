package step10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1); //data1이 참조하고 있는 값을 Integer 로 변환해주는 메소드. 100은 숫자로 변환 가능.
		int value2 = Integer.parseInt(data2); //NumberFormatException 발생. a100은 숫자로 변환 불가능.
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 +"="+ result);
	
	
	
	}

}
