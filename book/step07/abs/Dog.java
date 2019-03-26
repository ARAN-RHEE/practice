package step07.abs;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";  // 생성자. 부모 클래스의 kind 필드를 포유류로 초기화 해줌 
		}
	
	@Override
	public void sound() {  // 추상 메소드 재정의. 오버라이딩
		System.out.println("멍멍"); // 추상 메소드를 재정의 하지 않으면 컴파일 에러가 발생한다. 
	}
}
