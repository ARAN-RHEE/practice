package NonOOP;

import java.util.Scanner;

public class DuplicatedNumbers {
	public static boolean checkOverlap(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					// System.out.println(array[i]+"이 중복입니다.");
					count++;
					// System.out.println(count);
				}
			}
		}
		if (count == 0) {
			System.out.println("true");
			return true;

		} else {
			System.out.println("false");
			return false;
		}
	}

	// 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를
	// 구하시오.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		// Long inputNumber = scanner.nextLong();
		// String[] numberArray = String.valueOf(inputNumber).split("");
		// 숫자자료형으로 받으니 00으로 시작할 때 인식이 안되는 오류 발생..

		String inputNumber = scanner.next();
		String[] numberArray = inputNumber.split("");

		checkOverlap(numberArray);
	}

}
