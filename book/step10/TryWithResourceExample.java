package step10;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //강제적으로 예외 발생시킴 
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다."); 
			//try-with-resources는 예외가 발생하면 close()메소드로 리소스를 닫음 
			//인터페이스에서 close() 메소드를 오버라이딩 했기 때문에 실행됨
		}

	}

}
