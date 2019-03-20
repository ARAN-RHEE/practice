package step07.fieldExtends.array;
//실행 클래스 
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // Car 객체 생성
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); //run 메소드는 펑크난 바퀴의 위치를 리턴함 
		  // Car 객체의 run()메소드 5번 실행
			if(problemLocation != 0) { //펑크난 바퀴 위치가 0이 아닐때. 즉 리턴값이 있다 = 해당 바퀴가 펑크남 
				System.out.println(car.tires[problemLocation-1].location +  
						//바퀴 위치에서 -1 해주는 이유는 바퀴는 1,2,3,4로 위치를 지정했지만 인덱스는 0부터 시작하니까 
						"HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); //1회전시 출력되는 내용 구분
		
		}
// 바퀴가 펑크나면 자식 클래스(바퀴 부품)의 객체로 교체하고 교체된 이후 부터는 자식 클래스에서 오버라이딩 된 메소드가 실행된다. 
	}
}
