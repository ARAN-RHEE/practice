package step08_Interface.TypeConversion;

public class SportExample {

	public static void main(String[] args) {
		Sport sp = new Baseball(); // Baseball 객체를 인터페이스 타입에 대입 
		sp.play();
	//	sp.audience = 20; 접근 불가 
		
		sp.income(); // 필드에 접근 불가능하므로 당연히 0으로나옴. int의 초기값은 0이므로 
		
		
		Sport casting = new Football(); // Football 객체를 인터페이스 타입에 대입 
		Football football = (Football) casting;  // 강제 타입 변환 
		football.audience = 20; // audience 필드는 Sport 인터페이스에 없으므로 강제 타입 변환 실행. 
		casting.play();
		casting.income();//Football 타입으로 강제 변환했으므로 필드값 초기화 가능하고 해당 타입의 메소드 이용 가능 

	}

}
