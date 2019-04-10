package OOP;

import java.util.ArrayList;
import java.util.List;

public class CommonMethod {
	public ArrayList<String> makeArrayList(String[] array){
		ArrayList<String> switchArrayList = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			switchArrayList.add(array[i]);
		}
		
		return switchArrayList;
		
	}
}
