package step15_CollectionFramework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 0번 인덱스에 객체 만번 추가 
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime)+"ns");
		// 중간에 객체 추가 또는 삭제할 경우 LinkedList의 처리속도가 더 빠름 
	}

}
