package step11_API.Date_Calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		// TimeZone 클래스의 getAvailableIDs() 메소드는 시간대를 문자열로 알려줌 
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
