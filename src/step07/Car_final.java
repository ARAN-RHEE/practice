package step07;

public class Car_final {
 //필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
		// 스피드업 메소드가 호출될 때마다 speed 필드값 1씩 증가 
	}
	
	//fianl 메소드
	public final void stop() {
		System.out.println("차를 멈춤.");
		speed = 0;
	}
}
