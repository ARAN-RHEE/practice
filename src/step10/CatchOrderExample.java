package step10;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 +"+"+data2+"="+result);
		} catch(ArrayIndexOutOfBoundsException e) {  // 다중 catch문을 사용해도 하나의 catch블록만 실행.
			System.out.println("실행 매개값의 수가 부족합니다."); 
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다."); // ArrayIndexOutOfBoundsException이 아니고 다른 예외라면 이 블록이 실행  
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
