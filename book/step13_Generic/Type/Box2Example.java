package step13_Generic.Type;

public class Box2Example {

	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
		
		//따로 타입변환을 해주지 않아도 알아서 받아옴!! 

	}

}
