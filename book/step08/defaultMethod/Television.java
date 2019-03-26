package step08.defaultMethod;

public class Television implements RemoteControl {
 //필드
	private int volume;
	
	// 추상 메소드의 실체 메소드들을  오버라이딩. 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//인터페이스 상수를 이용해서 volume 필드의 값을 제한해줌 
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //volume 필드가 상수 맥스볼륨보다 크면 
			this.volume = RemoteControl.MAX_VOLUME; //맥스볼륨 값 대입
		} else if(volume < RemoteControl.MIN_VOLUME) { //volume 필드가 상수 min볼륨보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;// min볼륨 값 대입
		} else {
			this.volume = volume;
		}
		System.out.println(" 현재 Tv 볼륨 : " + volume);
	}
 
 }
