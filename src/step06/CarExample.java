package step06;

public class CarExample {

	public static void main(String[] args) {
		//객체 Car 생성.
		// 변수 myCar은 객체 Car을 참조.
		Car myCar = new Car();

		//필드값 읽기
		System.out.println("제작회사 : " + myCar.company );
		System.out.println("모델명 : " + myCar.model );
		System.out.println("색깔 : " + myCar.color );
		System.out.println("최고속도 : " + myCar.maxSpeed );
		System.out.println("현재속도 : " + myCar.speed );
		//필드값을 읽으려면 변수명 + 도트연산자 + 필드
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		//speed 속성은 필드 선언시 초기값을 주지 않았지만 출력하면 0인것을 확인할 수 있음.
	}

}
