package step11_API.Object;

public class CookieEqualsExample {
	public static void main(String[] args) {
		// 객체 생성. 파라미터가 필요한 생성자를 선언했으니 객체 생성할때 파라미터를 넣어주어야 함 . 
		Cookie chocoChip = new Cookie("초코칩",30);
		Cookie saewookang = new Cookie("새우깡",10);
		Cookie chickChok = new Cookie("초코칩",30);
		
	
		// 오버라이딩 한 메소드 호출. Cookie 객체 참조타입 
		chocoChip.equals(saewookang);
		chocoChip.equals(chickChok);
		}
	}

