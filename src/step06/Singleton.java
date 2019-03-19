package step06;

public class Singleton {
	private static Singleton singleton = new Singleton();  // 싱글톤 객체 생성 
	
	private Singleton() { }  //생성자
	
	static Singleton getInstance() {
		return singleton;  //외부에서 호출할 수 있는 정적 메소드 getInstance(). 
		// 정적 필드에서 참조하고 있는 자신의 객체를 리턴해줌 
	}
	
	
}
