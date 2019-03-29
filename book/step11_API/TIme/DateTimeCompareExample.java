package step11_API.TIme;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// 날짜와 시간 정보를 저장하는 객체 생성, of메소드에 파라미터를 주면 파라미터 값을 받은 날짜 저장됨 
		LocalDateTime startDateTime = LocalDateTime.of(2023,  1, 1, 9, 0, 0);
		System.out.println("시작일: " + startDateTime);
		
		// 날짜와 시간 정보를 저장하는 객체 생성, of메소드에 파라미터를 주면 파라미터 값을 받은 날짜 저장됨 
		LocalDateTime endDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);
		System.out.println("종료일: " + endDateTime + "\n");
		//--------------------------------------------------------------
		if(startDateTime.isBefore(endDateTime)) { // startDateTime 시간이 endDateTime보다 이전이라면
			System.out.println("진행 중입니다." + "\n"); //실행 
		} else if(startDateTime.isEqual(endDateTime)) { // 같다면  
			System.out.println("종료합니다." + "\n"); // 실행 
		} else if(startDateTime.isAfter(endDateTime)) { // startDateTime 시간이 endDateTime 이후라면
			System.out.println("종료했습니다." + "\n"); //실행 
		}
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		// 시간 차이 계산하는 메소드 until() 
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		//ChronoUnit. 열거타입은 전체 차이를 비교 
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 기간]"); //period 객체의 경우 단순비교임 월-월, 일-일, 년-년 
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간: " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "달 ");
		System.out.println(period.getDays() + "일\n");
		//--------------------------------------------------------------
		Duration duration =  // duration 객체도 단순비교 초-초 
      Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초: " + duration.getSeconds());

	}

}
