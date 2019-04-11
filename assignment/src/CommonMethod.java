package src;

import java.util.ArrayList;

public class CommonMethod {
	// 배열이 참조하고 있는 인덱스들을 새로운 ArrayList타입으로 리턴하는 메소드 
	public static ArrayList<String> makeArrayToArrayList(String[] array) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	}
	
	// ArrayList의 인덱스들이 중복일 경우 제거해서 새로운 ArrayList 리턴 
	public static ArrayList<String> removeArrayListOverlap(ArrayList<String> list){
		ArrayList<String> removeOverlap = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (!removeOverlap.contains(list.get(i))) {
				removeOverlap.add(list.get(i));
			}
		}
		return removeOverlap;
	}
	
	// String 참조 배열을 int 배열로 리턴 
	public static int[] stringArrayToIntArray(String[] array) {
		int[] numArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numArray[i] = Integer.parseInt(array[i]);
		}
		return numArray;
	}
	
	// 파라미터 int 배열 자료형의 인덱스들을 큰 수부터 작은수로 내림차순 재배치
	public static int[] descArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
