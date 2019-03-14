package step04;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':   //조건 둘 중 하나만 충족해도 아래 실행문이 실행된다. char 타입 변수도 switch 문에 사용 가능하다.
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':  //대문자 B 이거나 소문자b 둘중 하나이면 일반회원 결과 출력. 
		case 'b':
			System.out.println("일반 회원입니다");
			break;
		case 'C':
		case 'c':
			System.out.println("손님입니다.");
		default :
			System.out.println("손님2입니다.");  //default는 생략 가능하고, 괄호 안의 변수가 동일한 값을 갖는 case가 없으면
			// default 실행문이 실행된다.
		
		}
	}

}
