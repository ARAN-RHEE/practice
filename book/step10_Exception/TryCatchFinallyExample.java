package step10_Exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");  
			// forName 메소드 : 매개값으로 주어진 클래스가 존재하면 Class 객체 리턴. 존재하지 않으면 ClassNotFoundException 발생 
		} catch(ClassNotFoundException e) { // java.lang.String2 클래스가 존재하지 않으므로 예외 발생 - catch블록 실행
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
