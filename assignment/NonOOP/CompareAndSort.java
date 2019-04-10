package NonOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareAndSort {
	
	public static void findFirstName(String firstName, String[] name) {
		int count=0;
		for(int i=0; i<name.length;i++) {
			if(name[i].substring(0,1).equals(firstName)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void findOverlap(String findName, String[] name) {
		int count=0;
		for(int i=0; i<name.length;i++) {
			if(findName.equals(name[i])){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static ArrayList<String> removeOverlap(String[] array){
		ArrayList<String> toArrayList = new ArrayList<String>();
		ArrayList<String> removeOverlap = new ArrayList<String>();
		for(int i=0; i<array.length;i++) {
			toArrayList.add(array[i]);
		}
		
		for (int i = 0; i < toArrayList.size(); i++) {
			if (!removeOverlap.contains(toArrayList.get(i))) {
				removeOverlap.add(toArrayList.get(i));
			}
		}
		
	//	Collections.sort(removeOverlap);
		for(int i=0; i<removeOverlap.size();i++) {
			System.out.print(removeOverlap.get(i)+" ");
		}
		return removeOverlap;
	}
	
	public static void sort(ArrayList<String> array) {
		Collections.sort(array);
		for(int i=0; i<array.size();i++) {
			System.out.print(array.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		String name = "ÀÌÀ¯´ö,ÀÌÀç¿µ,±ÇÁ¾Ç¥,ÀÌÀç¿µ,¹Ú¹ÎÈ£,°­»óÈñ,ÀÌÀç¿µ,±èÁö¿Ï,ÃÖ½ÂÇõ,ÀÌ¼º¿¬,¹Ú¿µ¼­,¹Ú¹ÎÈ£,Àü°æÇå,¼ÛÁ¤È¯,±èÀç¼º,ÀÌÀ¯´ö,Àü°æÇå";
		String[] nameArray = name.split(",");
		
		findFirstName("±è",nameArray);
		findFirstName("ÀÌ",nameArray);
		findOverlap("ÀÌÀç¿µ",nameArray);
		ArrayList<String> removeOverlapNameArray = removeOverlap(nameArray);
		System.out.println();
		sort(removeOverlapNameArray);
		
	}
}