package OOP;

import java.util.Scanner;

public class DuplicatedNumbers {
	public static boolean checkOverlap(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					// System.out.println(array[i]+"�� �ߺ��Դϴ�.");
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
	
	
	//0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, �� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		long inputNumber = scanner.nextLong();
		String[] numberArray = String.valueOf(inputNumber).split("");
		checkOverlap(numberArray);
	}

	
}
