package step11_API.finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
		}
		
		counter = null; //Counter 객체를 쓰레기로 만듬. 참조하는 값이 없음 -> 쓰레기 
		System.gc(); // 쓰레기 수집기 실행 요청
	}

	
	// GC는 순서대로 소멸시키지 않고 무작위로 소멸시킴. 
	// 전부 소멸시키는 것이 아니고 메모리의 상태를 보고 일부만 소멸시킴 
	
}
