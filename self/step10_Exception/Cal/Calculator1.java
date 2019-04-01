package step10_Exception.Cal;

public class Calculator1 {
	int a;
	int b;
	
	public int add(int a,int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	public int substract (int a, int b) {
		int result = a-b;
		System.out.println(result);
		return result;
	}
}
