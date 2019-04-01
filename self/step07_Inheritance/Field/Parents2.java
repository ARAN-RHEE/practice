package step07_Inheritance.Field;

public class Parents2 extends GrandParents2{
	// 필드 familyName의 값은 조부모클래스의 familyName 값 넣어주기 
	String familyName;
	
	Parents2() {
		this.familyName= super.familyName;
	}
	
	@Override
	public String getFamilyName2() {
		return super.familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = super.familyName;
	}
	
}
