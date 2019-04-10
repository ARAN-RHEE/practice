package NonOOP;

import java.util.Scanner;

public class MaxNumber {
	public static void maxNumber(String[] array) {
		
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력할건가요?");
		int numberCount = scanner.nextInt();
		String[] numArray = new String[numberCount];
		for (int i = 0; i < numArray.length; i++) {
			System.out.println((i + 1) + "번째 수 : ");
			int inputNum = scanner.nextInt();
			numArray[i] = Integer.toString(inputNum);
		}

		StringBuilder num = new StringBuilder();
		for (int i = 0; i < numArray.length; i++) {
			num.append(numArray[i]);
		}

		String numToString = num.toString();
		String[] tempArray = numToString.split("");
		int[] numSplitArray = new int[tempArray.length];
		for (int i = 0; i < numSplitArray.length; i++) {
			numSplitArray[i] = Integer.parseInt(tempArray[i]);
		}

		for (int i = 0; i < numSplitArray.length; i++) {
			for (int j = i + 1; j < numSplitArray.length; j++) {
				if (numSplitArray[i] < numSplitArray[j]) {
					int temp = numSplitArray[i];
					numSplitArray[i] = numSplitArray[j];
					numSplitArray[j] = temp;
				}
			}
		}

		StringBuilder maxNum_String = new StringBuilder();
		for (int i = 0; i < numSplitArray.length; i++) {
			maxNum_String.append(Integer.toString(numSplitArray[i]));
		}

		int maxNum = Integer.parseInt(maxNum_String.toString());
		System.out.println("만들 수 있는 가장 큰 수 : "+maxNum);
	}	
}