package step08.multi;

public class SmartTelevision implements RemoteControl, Searchable{ // 다중 인터페이스 사용 가능 
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	// line 06 ~ line 23 은 인터페이스 RemoteControl의 추상 메소드에 대한 실체 메소드 
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		// 인터페이스 Searchable 의 추상메소드에 대한 실체 메소드. 다중으로 인터페이스를 상속할 경우에는 
		// 구현 클래스는 모든 인터페이스의 추상메소드에 대해 실체 메소드를 작성해야 하며, 하나라도 없으면 추상 클래스로 선언해야 함. 
	}

}
