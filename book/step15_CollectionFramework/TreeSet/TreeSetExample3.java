package step15_CollectionFramework.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		//TreeSet 객체 생성 
		TreeSet<String> treeSet = new TreeSet<String>();
		//String 문자열을 참조하는 객체를 담아줌 
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[ c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true,"f",true); 
		// 시작(c)과 끝(f) 으로 주어진 객체 사이의 객체들을 NavigableSet으로 리턴. 
		// 시작과 끝 객체의 포함 여부는 두번째, 네번째 매개값에 따라 달라짐 
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}
