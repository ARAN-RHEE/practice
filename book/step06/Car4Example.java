package step06;

public class Car4Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 myCar = new Car4();  //Car4에 선언된 메소드를 사용하기 위해 Car4 객체 생성 
		
		myCar.setGas(5);  // setGas 메소드에 파라미터 5를 저장함. setGas 메소드 호출 
		
		boolean gasState = myCar.isLeftGas();  // Car4의 isLeftGas() 메소드 호출. 리턴타입이 boolean 
		if(gasState) {  // gasState가 true일 때. 즉 연료가 있을 때 
			System.out.println("출발합니다");
			myCar.run();  //run 메소드 호출 
		}
		
		if(myCar.isLeftGas()) {  // gasState가 true일 때. 즉 연료가 있을 때
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");  // 연료가 없을 때. gas가 0이면 메소드는 false를 리턴한다 
		}
	}

}
