package step06;

public class ShopService { //싱글톤 ShopService 객체 만들기 
	private static ShopService shopService = new ShopService();
	// 싱글톤은 한개의 객체만 사용하므로 외부에서 객체를 호출할 수 없게 private 접근 제한자 사용 
	// static 선언으로 객체 생성 없이 접근할 수 있게 함. 
	
	private ShopService() {
		//클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다. 생성자를 호출만 만큼 객체가 생성되기 때문.
	}
	
	static ShopService getInstance() {  //외부에서 호출할 수 있는 정적 메소드 getInstance().
		return shopService; // 정적 필드에서 참조하고 있는 자신의 객체를 리턴해줌 
	}

}
