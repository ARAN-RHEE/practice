package step11_API.hashCode;

public class Key {
	// Key클래스에 필드 선언
	public int number;
	
	//파라미터로 int타입이 필요한 생성자 선언 
	public Key(int number) {
		this.number = number;
	}
	 
	@Override  //equals 메소드 오버라이딩 
	public boolean equals(Object obj) {
		if(obj instanceof Key) { // obj가 Key 타입이라면 
			Key compareKey = (Key) obj; // Key타입으로 강제 변환해주고 
			if(this.number == compareKey.number) {  // number 필드값이 같을 시 true 리턴 
				return true;
			}
		}
		// obj가 Key타입이 아니면 false 리턴 
		return false;
	}
}
