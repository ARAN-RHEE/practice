package step05_Reference.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxNumber {
	// n개의 숫자를 입력해서, 최댓값과 최솟값 출력하기
	// 숫자가 들어가지 않았을 경우 다시 입력하라고 하기

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력하시겠습니까?");
		int index = scanner.nextInt(); // 배열의 크기 지정
		System.out.println("입력할 숫자의 최댓값을 지정해주세요.");
		int max = scanner.nextInt(); // 최대값 지정. 최대값보다 큰 수를 입력하면 메인메소드를 종료시키려고 함

		int[] array = new int[index]; // 배열의 크기
		int maxNum = 0; // 최대값을 담을 변수를 0으로 초기화
		int minNum = max; // 최소값을 담을 변수를 지정한 최대값으로 초기화. minNum과 배열 값을 비교해서 작은 수를 담으려고함

		try {
			while(true) {
			for (int i = 0; i <= array.length - 1; i++) {
				System.out.println("[" + (i + 1) + "]번째 숫자 : "); // 인덱스 넘버는 배열의 순서보다 하나 작으므로 +1
				int data = scanner.nextInt();
				if (data > max) {
					System.out.println("지정한 범위 내의 수를 다시 입력하세요.");
					i--;
				} else {
					array[i] = data; // 범위 내에 맞는 값을 입력했다면 배열에 입력한 값을 담아줌
				}
			}
			//	break;
			} 
		} catch (InputMismatchException e) { // 숫자 말고 다른걸 입력했을때 예외처리
			// 예외 처리 시 종료되지 않고 다시 처음으로, 혹은 입력했던 순번으로 다시 돌아가게 하려면..?
			scanner = new Scanner(System.in);
			System.out.println("숫자만 입력하세요");
		}

		// 배열 내 값을 비교해서 max, min 값 담기
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
			if (array[i] < minNum) {
				minNum = array[i];
			}
		}

		System.out.println("최댓값은 " + maxNum + "입니다.");
		System.out.println("최솟값은 " + minNum + "입니다.");
	}
}
