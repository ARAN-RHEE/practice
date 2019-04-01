package step07_Inheritance.Field;

public class Parents extends GrandParents{
	// 필드 familyName의 값은 조부모클래스의 familyName 값 넣어주기 
	String familyName = super.familyName;
	
}
