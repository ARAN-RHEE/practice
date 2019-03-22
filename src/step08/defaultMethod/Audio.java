package step08.defaultMethod;

public class Audio implements RemoteControl {  //RemoteControl 인터페이스를 이용하는 클래스
	//필드
	private int volume;
	private boolean mute;
	
	// 추상메소드의 실체 메소드. 오버라이딩. 
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //volume 필드가 상수 맥스볼륨보다 크면 
			this.volume = RemoteControl.MAX_VOLUME; //맥스볼륨 값 대입
		} else if(volume < RemoteControl.MIN_VOLUME) { //volume 필드가 상수 min볼륨보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;// min볼륨 값 대입
		} else {
			this.volume = volume;
		}
		System.out.println(" 현재 오디오 볼륨 : " + volume);
	}
 
	@Override
	public void setMute(boolean mute) {  //디폴트 메소드 재정의 
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음 처리합니다.");
		} else {
			System.out.println("오디오 무음 해제합니다");
		}
	}
	
	
	
}
