package step11_API.finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{  // finalize() 오버라이딩 
		// finalize()메소드가 실행되면 번호를 출력하게 해서 어떤 객체가 소멸되는지 알 수 있게 함 
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
