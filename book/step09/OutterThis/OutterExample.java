package step09.OutterThis;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();  // 중첩클래스의 메소드를 사용하기 위해 바깥 Outter 객체 생성 
		Outter.Nested nested = outter.new Nested(); // 중첩클래스 객체 생성 
		nested.print(); 
	}

}
