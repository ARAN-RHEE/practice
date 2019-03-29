package step11_API.Date_Calendar;

import java.util.Calendar;

public class CalanderExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// Calendar 클래스는 추상클래스이기 때문에 new 연산자로 인스턴스 생성 불가능. 
		// 시간과 날짜를 계산하는게 지역이나 문화에 따라 다르기때문에 추상클래스로 만들어 놓은 것. 
		// getInstance()메소드를 사용하면 하위 클래스를 만들 필요 없이 현재 운영체제 시간을 기준으로 한 
		// Calendar 하위 객체를 얻을 수 있음 
		int year = now.get(Calendar.YEAR); // 연도 리턴 
		int month = now.get(Calendar.MONTH)+1; // 월 리턴 
		// 1월이 0을 리턴하므로 1을 더해주어야함 
		int day = now.get(Calendar.DAY_OF_MONTH); // 일 리턴 
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 리턴 
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY :
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM); // 오전 오후 리턴 
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		 
		int hour = now.get(Calendar.HOUR);  // 시 리턴 
		int minute = now.get(Calendar.MINUTE); // 분 리턴
		int second = now.get(Calendar.SECOND); // 초 리턴 
		// 상수들은 모두 Calendar 클래스에 선언되어 있음 
		
		System.out.println(year + "년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(strWeek+"요일");
		System.out.println(strAmPm+" ");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");

	}

}
