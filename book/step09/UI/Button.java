package step09.UI;

public class Button { // UI 클래스 
	OnClickListener listener; // 인터페이스 타입 필드 
	
	void setOnClickListener(OnClickListener listener) { //setter 메소드로 외부에서 구현 객체를 받아 필드에 대입 
		this.listener = listener;
	}
	
	void touch() { // touch()메소드가 실행(이벤트발생) 되었을 때 구현 객체의 onClick() 메소드 호출 
		listener.onClick();
	}
	
	interface OnClickListener{ // 중첩 인터페이스 
		void onClick();
	}
}
