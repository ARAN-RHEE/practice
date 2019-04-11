package src;

import java.util.ArrayList;
import java.util.Collections;

import src.CommonMethod;

public class CompareAndSort {
	/*
	public void findFirstName(String firstName, String[] name) {
		int count=0;
		for(int i=0; i<name.length;i++) {
			if(name[i].substring(0,1).equals(firstName)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void findOverlap(String findName, String[] name) {
		int count=0;
		for(int i=0; i<name.length;i++) {
			if(findName.equals(name[i])){
				count++;
			}
		}
		System.out.println(count);
	}
	*/
	
	// findFirstName, findOverlap을 메소드 하나만 이용하려면..? 어떤 방식이 더 효율적인것인지?
	public void finder(String findName, String[] name, int methodType) {
		// methodType이 1이면 해당 성을 가진 이름 검색, 2이면 해당 이름을 검색해서 갯수 리턴  
		int count=0;
		for(int i=0; i<name.length;i++) {
			if(methodType==1) {
				if(name[i].substring(0,1).equals(findName)) {
					count++;
				}
			} else {
				if(findName.equals(name[i])){
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public ArrayList<String> removeOverlap(String[] array){
		
	/*
		ArrayList<String> toArrayList = new ArrayList<String>();
		ArrayList<String> removeOverlap = new ArrayList<String>();
		for(int i=0; i<array.length;i++) {
			toArrayList.add(array[i]);
		}
		
		for (int i = 0; i < toArrayList.size(); i++) {
			if (!removeOverlap.contains(toArrayList.get(i))) {
				removeOverlap.add(toArrayList.get(i));
			} */
		ArrayList<String> toArrayList = CommonMethod.makeArrayToArrayList(array);
		ArrayList<String> removeOverlap = CommonMethod.removeArrayListOverlap(toArrayList);
	
		for(int i=0; i<removeOverlap.size();i++) {
			System.out.print(removeOverlap.get(i)+" ");
		}
		return removeOverlap;
	}
	
	public void sort(ArrayList<String> array) {
		Collections.sort(array);
		for(int i=0; i<array.size();i++) {
			System.out.print(array.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		CompareAndSort cas = new CompareAndSort();
		String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] nameArray = name.split(",");
		
		cas.finder("김",nameArray,1);
		cas.finder("이",nameArray,1);
		cas.finder("이재영",nameArray,2);
		ArrayList<String> removeOverlapNameArray = cas.removeOverlap(nameArray);
		System.out.println();
		cas.sort(removeOverlapNameArray);
		//cas.removeOverlap(new String[]{"김","김","송"});
		
	}
}