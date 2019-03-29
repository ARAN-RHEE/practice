package step10_Exception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {  // findClass()를 호출하는 main()메소드에서 try-Catch로 예외처리 
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException { // 예외 떠넘기기 
		Class clazz = Class.forName("java.lang.String2");
	}

}
