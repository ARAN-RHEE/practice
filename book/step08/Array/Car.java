package step08.Array;

public class Car {
	
	Tire[] tires = {
	// 4개의 타이어 필드를 인터페이스로 각각 선언하지 않고 인터페이스 배열로 관리  
	new HankookTire(),
	new HankookTire(),
	new HankookTire(),
	new HankookTire()
	};
	
	void run() { 
		for(Tire tire : tires) {  //향상된 for문. for(배열타입 변수명 : 배열 또는 컬렉션) { 실행문 } 
			// 배열 값이 대입 받는 변수에 대입되어 실행문이 실행됨. 
			tire.roll();
		}
	}
}
