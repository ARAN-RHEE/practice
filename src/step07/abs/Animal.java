package step07.abs;

public abstract class Animal {  // 추상 클래스. 'abstract' 키워드 붙어 있음. 
	public String kind;  // 필드 
	
	public void breathe() {  // 추상 클래스의 메소드 
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드 선언 
}
