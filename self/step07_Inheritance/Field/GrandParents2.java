package step07_Inheritance.Field;

public class GrandParents2 {
	// 조부모 클래스 
	String familyName;
	
	GrandParents2() { }
	GrandParents2(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyName2() {
		return familyName;
	}
	public void setFamilyName2(String familyName) {
		this.familyName = familyName;
	}
}
