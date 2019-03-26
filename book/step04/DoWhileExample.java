package step04;

import java.util.Scanner;  //Scanner 클래스를 사용하기 위해 필요. 

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요."); 
		
		Scanner scanner = new Scanner(System.in);  //scanner 객체 생성
		// system.in.read() 메소드는 하나의 키 코드만 읽기 때문에
		// 콘솔에 입력된 문자열을 한번에 읽으려면 scanner 객체를 생성해 nextLine() 메소드를 호출하면 된다.
		String inputString; // inputString 변수 선언. nextLine() 메소드를 읽은 문자열을 저장한다.  
		
		do {  // 결과에 상관 없이 do문 안의 실행문이 우선 한번 실행된다. 그 뒤에 while문 조건식이 평가되고, 
			  // true 일 경우 do문 안의 실행문이 반복 실행된다. 조건식의 결과가 false 이면 do-while문이 종료된다.
			System.out.println(">");  
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));  //!은 논리부정연산자로 true값이면 false 리턴, false값이면 true 리턴
		//입력된 값이 q가 아닐때, 조건이 참이므로 do 문이 반복된다.
		// q값이 입력되었다면 do-while문이 종료된다. 
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
