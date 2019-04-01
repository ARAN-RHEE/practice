package step10_Exception.Cal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {

		Calculator3 cal = new Calculator3();
		// Cal3 클래스가 상속을 받았기 때문에 부모,조부모 클래스의 메소드도 사용 가능
		// 메소드 잘 되는지 테스트
		// cal.add(1, 2);
		// cal.substract(1, 7);
		// cal.multiple(2, 3);
		// cal.divide(9, 2);
		// cal.power(2, 8);
		// cal.power(1, 3);
		// cal.power(3, 3);
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("num1 : ");
				int num1 = sc.nextInt();
				System.out.println("num2 : ");
				int num2 = sc.nextInt();

				System.out.println("1. + | 2. - | 3. * | 4. / | 5. n제곱");
				int calcu = sc.nextInt();
				if (calcu == 1) {
					cal.add(num1, num2);
				} else if (calcu == 2) {
					cal.substract(num1, num2);
				} else if (calcu == 3) {
					cal.multiple(num1, num2);
				} else if (calcu == 4) {
					cal.divide(num1, num2);
				} else {
					cal.power(num1, num2);
				}

				System.out.println("계산기를 종료하시겠습니까? 1. Yes 2. No");
				int select = sc.nextInt();
				if (select == 1) {
					System.out.println("종료되었습니다.");
					return;
				} else {
					continue;
				}

			} catch (InputMismatchException e) {
				// int 타입이 아닌 다른걸 입력했을때 발생하는 예외 
				System.out.println("숫자만 입력해 주십시오");
				break;
				// 예외가 발생했을 때는 예외 문구를 띄우고, 다시 try블록으로 이동하게 하려면..? 
			}
		}
	}
}
