package step06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();  //Calculator 클래스의 메소드를 호출하기 위해 객체 생성 
		myCalc.powerOn(); //변수명+.+메소드이름(파라미터) 형태로 호출 시 메소드 실행 
		
		int result1 = myCalc.plus(5, 7); //plus 메소드에 파라미터 5,7 저장 
		System.out.println("result1 : " + result1); 
		
		byte x = 10;  
		byte y = 4;
		double result2 = myCalc.divide(x, y);  //divide 메소드에 파라미터 10,4 저장. 
		//본래 파라미터에 int 타입이 들어가야 하지만 byte->int 자동 형변환 됨. 
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();  //전원을 끄는 메소드 실행

	}

}
