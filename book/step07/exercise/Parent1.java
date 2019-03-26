package step07.exercise;

public class Parent1 {
	public String nation;
	
	public Parent1() {  //생성자의 매개변수의 유형과 개수를 다르게 하여 같은 이름의 생성자를 여러 개 가질 수 있다.
		// 파라미터가 없는 기본 생성자 
		this("대한민국"); // 자기의 또 다른 생성자를 실행. 즉 아래 파라미터가 있는 생성자가 먼저 실행된 뒤 아래 println 출력 
	   System.out.println("Parent() call");
	}
	
	public Parent1(String nation) {  // 파라미터에 String타입의 nation 변수 필요 
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
