package step12_Thread.SubClass2;

import java.util.Calendar;
import java.util.Scanner;

public class PlayerA extends Thread {
	String name;
	PlayerA(String name) {
		this.name = name;
	}
    
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "의 평균 속도는?");
		int avgSpeed = sc.nextInt();
		int time = (int)(Run.DISTANCE / avgSpeed)+1;
		
		
		// 빨리 작업 끝내려고 일단 속도를 초속으로 계산
		Calendar cal = Calendar.getInstance();

		long startTime =  cal.getTimeInMillis();
		long currentTime =startTime;
		
		boolean running = true;
		
		while(running){
    	  System.out.println(name+"번 선수가 달립니다.");
    //	  System.out.println(time);
    //	  System.out.println(startTime);
           currentTime = cal.getTimeInMillis();
    //     System.out.println(currentTime);
           if(currentTime>startTime+time*1000) {
        	   running=false;
           }
       }
       System.out.println(name+"번 선수가 종점에 도착했습니다.");
   
	}	

}
