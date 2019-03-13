package step02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 128;
		  
		  
		  //조건절이 참일 경우 if문 결과 실행, 거짓일 경우 else 결과 실행. 
		  if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {  
			  // 비교연산 || 는 교집합 or의 의미. 조건 둘 중 하나만 참이어도 참.
			  System.out.println("byte 타입으로 변환 불가.");
			  System.out.println("값을 다시 확인해주세요.");  
		  } else {
			  byte b = (byte) i;
			  System.out.println(b);
		  }
	}
	// byte는 -127~127 사이이므로, 위 조건은 참.
	

}
