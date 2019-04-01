package step07_Inheritance.Field;

public class Child2 extends Parents2 {
	String familyName;
	
//	Child2(){
//		this.familyName = super.familyName;
//	}
	@Override
	public String getFamilyName2() {
		return super.familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = super.familyName;
	}
	
	public void whatIsYourFamilyName() {
		System.out.println("제 성은 " + familyName + "입니다.");
	}
}
