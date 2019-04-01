package step08_Interface.TypeConversion;

public class Football implements Sport {

	int audience;
	@Override
	public void play() {
		System.out.println("축구 경기가 진행중입니다.");
		
	}

	@Override
	public int income() {
		int income = audience*ticketPrice;
		System.out.println(income);
		return income;
	}

}
