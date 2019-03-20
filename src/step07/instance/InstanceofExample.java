package step07.instance;

public class InstanceofExample {

	public static void method1(Parent parent) {  //method1() 메소드는 파라미터로 Parent타입을 필요로함 
		if(parent instanceof Child) {   // parent 변수가 Child 타입을 참조한다면  - parent -> child로 변환 가능한지 확인 
			Child child = (Child) parent;   // parent를 child로 강제 타입 변환. 부모 -> 자식
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;  // parent를 child로 무조건 강제 타입 변환. 부모-> 자식 
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();  // parentA는 Child 타입, 즉 자식 타입으로 자동 변환되었음 
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); // parentB는 parent 타입을 참조하고 있음. 부모가 부모클래스 참조 
		method1(parentB); // parentB는 Parent 타입을 참조하므로 method1()에서 else문을 타게 됨 
		method2(parentB); //예외 발생

	}

}
