package step07;

public class SportsCar_final extends Car_final{
	@Override
	public void speedUp() {
		speed += 10;
		//부모 클래스에서는 speed += 1; 였지만 오버라이드 해서 메소드를 재 정의했음 
	}
	/*
	//오버라이딩 불가능
	@Override 
	public void stop() { // Cannot override final method 오류메세지 나옴 
		System.out.println("스포츠카를 멈춤");
		speed=0;
	}  */
}
