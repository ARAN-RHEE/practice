package step12_Thread.SubClass;

import java.util.Calendar;

public class NonUseThreadExample {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println("가위");
		}
		for(int i=0; i<=10; i++) {
			System.out.println("바위");
		}
		for(int i=0; i<=10; i++) {
			System.out.println("보");
		}
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
	}

}
