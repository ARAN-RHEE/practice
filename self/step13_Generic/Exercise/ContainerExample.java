package step13_Generic.Exercise;

public class ContainerExample {
	public static void main(String[] args) {
		// Container 제네릭 타입 선언하기 
		// 사용하는 객체의 타입은 달라도 공통적으로 set, get 메소드 사용
		
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
