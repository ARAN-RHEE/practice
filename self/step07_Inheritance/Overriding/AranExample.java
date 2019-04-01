package step07_Inheritance.Overriding;

public class AranExample {

	public static void main(String[] args) {
		Aran2 ar = new Aran2();
		// 부모 클래스에 있는 필드, 본인 클래스에 있는 필드 모두 접근 가능 
		ar.age = 27;
		ar.born = 1993;
		ar.city = "고양시";
		ar.name="이아란";
		
		
		ar.information(); // 메소드 실행 시 자식 클래스에서 재정의 된 메소드가 실행됨 
	//	super.information(); 부모객체 생성 안하고 바로 부모 메소드에 접근하려면? 
		System.out.println();
		
		Aran arr = new Aran(); // 부모 클래스 객체 생성
		arr.information(); // 부모 클래스에 있던 메소드가 실행됨 
				

	}

}
