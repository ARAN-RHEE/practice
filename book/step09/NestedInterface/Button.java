package step09.NestedInterface;

public class Button {
	OnClickListener listener;  // 인터페이스 타입 필드 
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; //파라미터의 다형성 
	}
	
	void touch() {  // 구현 객체의 onClick()메소드 호출
		listener.onClick();
	}
	
	interface OnClickListener {  // 클래스 내부에 선언한 중첩인터페이스 
		void onClick(); // 인터페이스의 추상메소드
	}
}
