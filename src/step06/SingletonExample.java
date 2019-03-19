package step06;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Singleton obj1 = new Singleton() // 컴파일 에러
		 * Singleton obj2 = new Singleton() // 컴파일 에러 
		 * */
		
		Singleton obj1 = Singleton.getInstance(); //외부에서 객체를 얻는 유일한 방법 = getInstance() 메소드를 호출 
		Singleton obj2 = Singleton.getInstance(); //getInstance() 메소드는 단 하나의 객체만 리턴하므로 obj1 obj2는 동일 객체 참조
		
		if(obj1==obj2) { // obj1과 obj2가 같은 객체를 참조하는지 확인하기 위한 if문 
			System.out.println("같은 Singleton 객체 입니다");
		} else {
			System.out.println("다른 Singleton 객체 입니다");
		}
	}

}
