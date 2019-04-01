package step09_MultiClass;

public class DrinkExample {

	public static void main(String[] args) {
		//Drink.Coke dc = new Drink.Coke();
		Drink drink = new Drink();
		Drink.Coke dc = drink.new Coke();
		
		dc.company = "coka";
		drink.kcal = 50;
		
		
		Drink.Juice juice = new Drink.Juice();
		juice.sugar = 0;
		
		// ((Drink) juice).sugar(); 형변환 불가 
		
		drink.sugar();
		dc.sugar = 1;
	//	((Drink) dc).sugar(); 형변환 불가 
	}
 // 중첩 클래스에서 메소드에 접근하려면?
}
