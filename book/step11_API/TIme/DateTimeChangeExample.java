package step11_API.TIme;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		// 현재 날짜+시간을 저장하기 위한 LocalDateTime 객체 생성 
		System.out.println("현재: " + now);
		
		LocalDateTime  targetDateTime = null;
		// 변경할 날짜+시간 정보를 참조할 객체 생성 
		
		//직접 변경
		targetDateTime = now
				//변경할 데이터를 직접 줄 수 있음 
			.withYear(2024)
			.withMonth(10)
			.withDayOfMonth(5)
			.withHour(13)
			.withMinute(30)
			.withSecond(20);
		System.out.println("직접 변경: " + targetDateTime);
		
		//년도 상대 변경
		// 현재 날짜 기준 
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
			System.out.println("이번 해의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
			System.out.println("이번 해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
			System.out.println("다음 해의 첫 일: " + targetDateTime);
		
		//월 상대 변경
		// 현재 날짜 기준
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
			System.out.println("이번 달의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
			System.out.println("이번 달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
			System.out.println("다음 달의 첫 일: " + targetDateTime);
			
		//요일 상대 변경
		// 현재 날짜 기준
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
			System.out.println("이번 달의 첫 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			System.out.println("돌아오는 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
			System.out.println("지난 월요일: " + targetDateTime);

	}

}
