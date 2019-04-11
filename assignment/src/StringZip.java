package src;

import java.util.ArrayList;
import java.util.Scanner;

public class StringZip {
	public void stringZip(String input) {
		String[] inputArray = input.split("");
		/*
		ArrayList<String> inputList = new ArrayList<String>();
		ArrayList<String> removeOverlap = new ArrayList<String>();

		
		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		} */
		
		ArrayList<String> inputList = CommonMethod.makeArrayToArrayList(inputArray);
		ArrayList<String> removeOverlap = CommonMethod.removeArrayListOverlap(inputList);

	/*	for (int i = 0; i < inputList.size(); i++) {
			if (!removeOverlap.contains(inputList.get(i))) {
				removeOverlap.add(inputList.get(i));
			}
		} */
		
		for (int i = 0; i < removeOverlap.size(); i++) {
			int count = 0;
			System.out.print(removeOverlap.get(i));
			for (int j = 0; j < inputList.size(); j++) {
				if (removeOverlap.get(i).equals(inputList.get(j))) {
					count++;
				}
			}
			System.out.print(count);
		}

	}

	public static void main(String[] args) {
		StringZip zip = new StringZip();
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String input = scanner.next();
		zip.stringZip(input);
	}

}
