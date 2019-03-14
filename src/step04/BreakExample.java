package step04;

public class BreakExample {

	public static void main(String[] args) {
		// break는 반복문인 for, while, do-while문을 실행 중지할 때 사용한다.
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			// 1에서 6까지 랜덤으로 정수 하나 담기 
			
			System.out.println(num);  // 랜덤으로 뽑은 정수 콘솔에 출력 
			
			if(num==6) {  // 랜덤으로 뽑은 숫자가 6일 때 break. 즉 while문을 중지시킴.
				break;
			}
		}
		//while문 중지 후 프로그램 종료 콘솔에 출력
		System.out.println("프로그램 종료");
		
		// break는 if문과 같이 사용되어 if문의 조건식에 따라 for문과 while문을 종료할 때 사용함. 
	}

}
