package step08.exercise;

public class Chatting { // 
	void startChat(String chatId) { 
	
		//String nickName = null; 
		//nickName = chatId;   오류가 나는 이유는 익명 구현 객체 에서 사용된 
		// 파라미터와 로컬변수는 모두 final특징을 가지기 때문임. 그래서 값을 변경해 줄 수 없음 
		
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
	
	class Chat {
		void start() { }
		void sendMessage(String message) { }
	}
}
