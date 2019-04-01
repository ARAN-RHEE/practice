package step07_Inheritance.Field;

import java.util.Scanner;

public class FamilyExample {
// 셀프. 조부모 클래스 -> 부모 클래스 -> 자식 클래스 순으로 상속되는데
// 조부모 클래스에 필드값을 주고 부모와 자식이 이어받는거 출력해보기 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("조부모의 성 : ");
		
		String familyName = scanner.nextLine();
		
		GrandParents gp = new GrandParents(familyName);
		Parents parents = new Parents();
		Child child = new Child();
		
		
		// 왜 null???? 
		System.out.println("조부모의 성 : " + gp.familyName);
		System.out.println("부모의 성 : " + parents.familyName);
		System.out.println("자식의 성 : " +child.familyName);
		child.whatIsYourFamilyName();

	
	}

}
