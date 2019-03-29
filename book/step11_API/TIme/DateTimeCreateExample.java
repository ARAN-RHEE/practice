package step11_API.TIme;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException{
		// 날짜 얻기 
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: " + currDate);
		// 날짜 정보만 저장 가능. now()는 현재 날짜 정보 저장한 객체 리턴 

		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜: " + targetDate + "\n");
		// 날짜 정보만 저장 가능. of()는 파라미터로 주어진 날짜 정보를 저장한 객체 리턴

		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: " + currTime);
		// 시간 정보만 저장 가능. now()는 현재 날짜 정보 저장한 객체 리턴 
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간: " + targetTime + "\n");
		// 시간 정보만 저장 가능. of()는 파라미터로 주어진 시간 정보를 저장한 객체 리턴
		
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		// 날짜+시간 정보 저장 가능. now()는 현재 시간+날짜 정보 저장한 객체 리턴 
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		// 날짜+시간 정보만 저장 가능. of()는 파라미터로 주어진 날짜+시간 정보를 저장한 객체 리턴
		
		//협정 세계시와 시간존(TimeZone)
		ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		//TimeZone->선택한 시간대 리턴. UTC 시간대의 현재 시간 리턴 
		
		ZonedDateTime newyorkDateTime = 
       ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		//파라미터로 원하는 시간대 입력 후 리턴된 객체 받음 
		
		//특정 시점의 타임스탬프 얻기
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		//메소드는 현재 쓰레드가 일정 기간동안 실행을 중지시킴.
		Instant instant2 = Instant.now();		
		if(instant1.isBefore(instant2)) { 
			System.out.println("instant1이 빠릅니다.");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		} else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
		// until() 는 두 시점 간의 차이를 리턴함. 
		// NANOS->나노세컨드 초를 의미 1/10^9

	}

}
