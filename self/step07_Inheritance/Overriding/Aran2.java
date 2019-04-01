package step07_Inheritance.Overriding;

public class Aran2 extends Aran {
	//필드 선언 
	int born;
	
	
	@Override
	// 메소드 오버라이딩
	// 부모 클래스에 있는 메소드를 재정의했음! 
	public void information() {
		System.out.println("자식 클래스 메소드");
		super.information();
		System.out.println(born+"에 태어남");
	}
}
