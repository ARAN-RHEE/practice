package step06;

public class Car9Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 myCar = new Car9();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed()); // 속도가 음수일 때 0으로 리턴하는 getSpeed 메소드 
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {  // myCar.isStop()이 false 이면 
			myCar.setStop(true); // setStop 메소드를 호출해서 stop 필드를 true로, speed 필드를 0으로 변경한다. 
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
