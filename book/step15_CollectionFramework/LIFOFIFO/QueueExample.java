package step15_CollectionFramework.LIFOFIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		//LinkedList 객체를 Queue 인터페이스타입으로 변환 
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//큐에 겍체 저장
		messageQueue.offer(new Message("sendMail","홍길동"));  
		messageQueue.offer(new Message("sendSMS","신용권"));  
		messageQueue.offer(new Message("sendKakaoTalk","홍두께"));
		
		while(!messageQueue.isEmpty()) { // 큐가 비어있지 않다면 
			Message message = messageQueue.poll(); //하나씩 꺼내기 
			switch(message.command) { // command에 맞는 case 실행 
			case "sendMail" :
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to+"님에게 SMS을 보냅니다.");
				break;
			case "sendKakaoTalk" :
				System.out.println(message.to+"님에게 카톡을 보냅니다.");
				break;
				// Queue는 먼저 넣은 객체가 먼저 나옴. 즉 넣은 순서대로 처리됨 
			}
		}
	}
}
