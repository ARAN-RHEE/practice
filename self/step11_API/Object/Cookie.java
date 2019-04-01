package step11_API.Object;

public class Cookie {
	//필드 선언
	String productName;
	int weight;
	//생성자 선언 
	public Cookie(String productName, int weight) {
		this.productName = productName;
		this.weight = weight;
	}
	// equals 메소드 오버라이딩
	// 두 필드(속성)값이 일치해야 true 리턴 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cookie) {
			Cookie cookie = (Cookie) obj;
			if(productName.equals(cookie.productName)) {
				if(weight==cookie.weight) {
					System.out.println("같은 과자입니다.");
					return true;
				}
			}
		}
		System.out.println("다른 과자입니다.");
		return false;
	}
}
