package step05;

public class test3 {
	public static void main(String[] args) {
		
		String abc = "abc";
		String abc1 = "abc";
		String abc2 = new String("abc");
		
		if(abc==abc1) {
			System.out.println("1. true");
		} else {
			System.out.println("1. false");
		}
		
		
		if(abc == abc2) {
			System.out.println("2. true");
		} else {
			System.out.println("2. false");
		}
		
		System.out.println("3. " + abc2.equals(abc));
		System.out.println("3. " + abc2.equals(abc1));
	}
}
