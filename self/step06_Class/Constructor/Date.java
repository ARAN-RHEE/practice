package step06_Class.Constructor;

public class Date {
	int year;
	String month;
	int day;
	
	Date(){
	}
	
	Date(int year){
		this.year = year;
	}
	
	Date(int year, String month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
				
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		date.year = 2;
		date.month = "3";
		date.day = 20;
		System.out.println(date.month);
	}
}
