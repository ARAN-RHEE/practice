package step04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);  //Scanner 객체는 입력받을 때까지 기다린다. 

		String inputString;  //선택 입력값. 예금/출금/잔고/종료. nextLine() 메소드를 읽은 문자열을 저장한다.
		String deposit; // 예금 입력값 저장
		String withdraw; // 출금 입력값  저장 
		String deposit_trim;  // 예금 입력값에서 공백 제거 
		String withdraw_trim; // 출금 입력값에서 공백 제거 
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("선택 > ");
			
			inputString = scanner.nextLine();  //
			
			/* equals로 문자열을 비교할 때,  비교하고자 하는 주체 중 앞에 작성하는 객체가 null일 경우 NullPointerException이 발생한다.
			 * 따라서 null이 아님이 확실한 값을 먼저 놓고 equals 메소드를 호출하는 것이 좋다. 
			 * 객체의 값을 적고 메소드를 호출해서 바로 비교하기 보다는 변수명으로 비교하는 것이 좋음
			 * 변하지 않는 값들은 상수처리 해서 비교하는 것이 좋음. 
			 * */
			
			if("1".equals(inputString)) {  //선택에 입력한 값이 1일 때 
				System.out.println("예금액 > "); //예금액 입력할 수 있게 콘솔에 출력
				deposit = scanner.nextLine();  // scanner 객체의 nextLine 메소드 호출. deposit 입력값 입력 할때까지 기다림.
				deposit_trim = deposit.replaceAll(" ",""); // 입력값에 공백이 있을 경우 제거 
				balance += Integer.parseInt(deposit_trim); // 공백을 제거한 입력값(예금) 을 잔고에 더하고 잔고를 저장.
				// 입력값은 String으로 선언되었기 때문에 int로 형변환하려면 Integer 객체의 parseInt 메소드를 선언해서 변환해줘야함. 
				
			}
			
			if("2".equals(inputString)) {  // 선택에 입력한 값이 2일 때 
				System.out.println("출금액 > ");  // 출금액 입력할 수 있게 콘솔에 출력
				withdraw = scanner.nextLine(); // scanner 객체의 nextLine 메소드 호출. withdraw 입력값 입력 할때가지 기다림.
				withdraw_trim = withdraw.replaceAll(" ", ""); // 입력값에 공백이 있을 경우 제거.
				// 훨씬 효율적으로 하는 방법 찾아보기. 
				balance -= Integer.parseInt(withdraw_trim); // 잔고에서 출금액을 빼고, 그 값을 잔고에 저장. 
				
			}
			
			if("3".equals(inputString)) {
				System.out.println(balance);  // 입력값이 3일 때 현재 잔고 콘솔에 출력. 
			}
			
			if("4".equals(inputString)) {  // 입력값이 4일 때 while 문 종료. 
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
