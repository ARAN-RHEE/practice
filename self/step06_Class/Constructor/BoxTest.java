package step06_Class.Constructor;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box(); //기본 생성자
		box1.width = 10;
		box1.depth = 5;
		box1.height = 2;
		System.out.println(box1.depth);
		
		Box2 box2 = new Box2(3,3,3);  // 파라미터를 갖는 생성자를 선언했음. 그래서 객체 생성할때 파라미터를 넣어주어야 함.
		box2.getVolume();

	}

}
