package step07_Inheritance.Method;

public class Calculator2 extends Calculator1 {
	int a;
	int b;
	
	public int multiple(int a,int b) {
		int result = a*b;
		System.out.println(result);
		return result;
	}
	
	public double divide (int a, int b) {
		double result = (double)(a)/(double)(b);
		System.out.println(result);
		return result;
	}
}
