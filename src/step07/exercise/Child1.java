package step07.exercise;

public class Child1 extends Parent1 { //Parent1의 하위(자식) 클래스인 Child1 클래스 
	private String name; //필드 
	
	public Child1() {  // 기본 생성자 
		this("홍길동"); //자기의 또 다른 생성자를 실행. 즉 아래 파라미터가 있는 생성자가 먼저 실행된 뒤 아래 println 출력 
		System.out.println("Child() call");
	}
	
	public Child1(String name) {  // 파라미터가 있는 생성자 
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
