package step11_API.TIme;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		// 현재 날짜+시간을 얻기 위한 LocalDateTime 객체 생성 
		System.out.println("현재시: " + now);
		
		// now 변수에 날짜 연산해줄 객체 참조시킴 
		LocalDateTime  targetDateTime = now
			.plusYears(1) 
			.minusMonths(2)
			.plusDays(3)
			.plusHours(4)
			.minusMinutes(5)
			.plusSeconds(6);
		System.out.println("연산후: " + targetDateTime);

	}

}
