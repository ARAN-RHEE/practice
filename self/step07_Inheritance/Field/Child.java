package step07_Inheritance.Field;

public class Child extends Parents {
	String familyName = super.familyName;
	
	
	public void whatIsYourFamilyName() {
		System.out.println("제 성은 " + familyName + "입니다.");
	}
}
