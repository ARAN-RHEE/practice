package step07.casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();  // 자식 -> 부모로  자동 타입 변환 
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2="data"; // field2 필드는 자식 클래스에 선언되어 있으므로 접근 불가능 
		 * parent.method3(); //method3() 메소드는 자식 클래스에 선언되어 있으므로 사용 불가능 
		 */
		
		Child child = (Child) parent; //부모 타입 -> 자식 타입으로 강제 변환 
		child.field2 = "yyy"; //자식타입으로 변환되었으므로 field2 접근 가능
		child.method3(); // 자식 타입으로 변환되었으므로 자식 클래스에서만 선언되어있던 method3() 사용 가능

	}

}
