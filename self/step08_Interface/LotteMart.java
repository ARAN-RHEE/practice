package step08_Interface;

public class LotteMart implements shoppingMall{
	//필드 선언
	int price;
	
	// int 타입 파라미터가 필요한 생성자 선언 
	LotteMart(int price){
		this.price = price;
	}
	@Override
	// 인터페이스에 있던 메소드 오버라이딩 
	public void income() {
		int income = price*customer;
		System.out.println("롯데마트 매출액은" +income+ "원 입니다");
	}
}
