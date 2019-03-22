package step07.exercise;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//this.name = name;
		super(name);  // 부모 클래스의 파라미터가 있는 생성자를 호출하려면 super(파라미터) 이렇게 호출하면 됨. 
		this.studentNo = studentNo;
	}
	
	// Line7. 오류가 나는 이유는 상속받은 부모 Parent가 기본 생성자가 없기 때문. 
	// 부모 클래스에서 기본 생성자가 없고 파라미터가 있는 생성자만 있다면 자식 생성자에서 반드시 부모 생성자(파라미터..)를 명시적으로 호출해야함. 

}
