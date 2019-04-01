package step09_MultiClass;

public class Drink {
	String flavor;
	String Category;
	int kcal;
	String ingredients;
	int sugar;
	//중첩 인스턴스 멤버 클래스 
	class Coke {
		int kcal;
		String company;
		int sugar;
		
	}
	
	static class Juice {
		int kcal;
		int sugar;
		
	}
	
	public void sugar() {
		class sevenUp {
			int kcal;
			int sugar;
		}
		if(sugar==0) {
			System.out.println("무설탕 음료 입니다.");
		} else {
			System.out.println("무설탕 음료가 아닙니다.");
		}
	}
}
