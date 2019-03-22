package step09.NestedInterface;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button(); //버튼 객체 생성 
		
		
		// 어떤 구현 객체를 생성해서 Button 객체의 set~메소드로 세팅하느냐에 따라 touch() 메소드의 결과가 달라짐 
		btn.setOnClickListener(new CallListener());  
		btn.touch();  // set~메소드에 파라미터로 CallListener 객체를 생성해서 세팅. 
		
		btn.setOnClickListener(new MessageListener());
		btn.touch(); // set~메소드에 파라미터로 MessageListener 객체를 생성해서 세팅 
	}
}
