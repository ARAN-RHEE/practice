package step07;

public class DmbCellPhone_extends extends CellPhone_extends{ //자식 클래스. CellPhone~ 클래스를 상속받음. 
	//필드
	int channel;
	
	//생성자
	DmbCellPhone_extends(String model, String color, int channel){
		this.model = model;  // 부모클래스로부터 상속받은 필드 
		this.color = color; // 부모클래스로부터 상속받은 필드 
		this.channel = channel;
	}
	
	//메소드 
	void turnOnDmb() {
		System.out.println("채널  "+ channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
