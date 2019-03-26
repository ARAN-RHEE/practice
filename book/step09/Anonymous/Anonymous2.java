package step09.Anonymous;

public class Anonymous2 {
//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {   //익명 구현 객체 생성하기 
		@Override  
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다.");
		}  // 추상메소드의 실체 메소드부분을 작성해주어야 함. 
	};  
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
