package step06;

public class Car9 {
	//필드
	private int speed;
	private boolean stop; //필드를 private 접근제한을 두는 이유는 외부에서 함부로 읽고 변경하지 못하게 하기 위함 
	
	
	// 생성자
	// 생략
	
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
