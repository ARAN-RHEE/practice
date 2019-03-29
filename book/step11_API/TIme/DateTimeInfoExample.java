package step11_API.TIme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		// 현재 날짜+시간 출력 

		//현재 날짜+시간에 대한 정보 얻기 (get~메소드) 
		// 정보를 String 타입의 strDateTime 변수에 참조시킴 
		String strDateTime = now.getYear() + "년 ";
		// 문자열 연산 
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate(); 
		//LocalDate는 날짜 정보만 저장. now->현재 시간의 날짜 정보만 저장 
		if(nowDate.isLeapYear()) { // isLeapYear 윤년여부 확인하는 메소드 
			System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
		} else {
			System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
		}
		
		//협정 세계시와 존오프셋
		//파라미터로 얻고싶은 시간대를 작성하면 정보를 얻을 수 있음 
		ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime seoulDateTime =  ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임존: " + seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		// 시간대 이름 얻기 
		System.out.println("서울 존아이디: " + seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();//존오프셋. 시차 리턴
		System.out.println("서울 존오프셋: " + seoulZoneOffset + "\n");

	}

}
