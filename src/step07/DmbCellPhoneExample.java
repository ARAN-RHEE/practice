package step07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone 객체 생성
		DmbCellPhone_extends dmbCellPhone = new DmbCellPhone_extends("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		//DmbCellPhone 의 필드 
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUP();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		// 자식 클래스는 상속받은 부모 클래스의 필드, 메소드를 모두 사용할 수 있다. 단 private 접근제한인 경우는 사용 불가능하고
		// 패키지가 다를때는 default 접근 제한인 경우도 사용 불가능하다. 
	}

}
