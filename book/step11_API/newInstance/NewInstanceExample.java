package step11_API.newInstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("step11_API.newInstance.SendAction");
			//Class clazz = Class.forName("step11_API.newInstance.ReceiveAction");
			
			Action action = (Action)clazz.newInstance(); //인터페이스의 동적 객체 생성 
			//파라미터의 클래스가 인터페이스를 구현하고 있기 때문에 인터페이스 타입으로 변환 가능 
			action.execute(); // 메소드 실행 시 파라미터로 주어진 클래스의 메소드가 실행됨 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
 