package step08_Interface;

public class HomePlus implements shoppingMall{

	int price;
	int quantity;
	
	HomePlus(int price){
		this.price = price;
	}
	@Override
	//인터페이스에 있던 메소드 오버라이딩 
	public void income() {
		int income = price*customer;
		System.out.println("홈플러스 매출액은" +income+ "원 입니다");
	}
}
