package step07;

public class ChildExample_Promotion {
	public static void main(String[] args) {
		// child 객체 생성
		Child_promotion child = new Child_promotion();
		
		Parent_promotion parent = child; // 자동 타입 변환. 자식클래스를 부모클래스로 타입 변환시킴.
		parent.method1();  
		parent.method2();  // 재정의된 메소드가 호출됨 
	//	parent.method3(); // 호출 불가능함. method3은 자식 클래스에서만 선언 되었기 때문  
	}
}
