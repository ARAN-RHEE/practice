package step05_Reference.Array;

import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {
		// 숫자를 입력한 후, 크기순으로 나열했을 때 중간값을 출력하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자의 갯수는?");
		int idx = scanner.nextInt(); // 배열의 크기를 정하는 수 담음 
		int[] array = new int[idx]; // 배열 생성 

		for (int i = 0; i < array.length; i++) { // 배열에 값 입력. 위에 크기를 정한 수만큼 for문이 돌게 됨 
			System.out.println("arr[" + i + "] : ");
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) { 
				if (array[i] > array[j]) {  // 배열에 담긴 값을 크기 순으로 재배치하기. 
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		if (idx % 2 == 0) {
			System.out.println((idx/2)+"번째 수 : " + array[idx / 2 - 1]);
			System.out.println((idx/2+1)+ "번째 수 : "  +array[idx / 2]);
		} else {
			System.out.println(array[idx / 2]);
		}

	}
}
