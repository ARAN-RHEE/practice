package step11_API.System.Exit;

public class ExitExample {

	public static void main(String[] args) {
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status != 5) { // status값이 5일때 종료시키려고 함. 
					// 다른 수가 나왔을 때는 종료되면 안되므로 5가 아니면 모두 예외처리 
					throw new SecurityException();
				}
			}
		});

		
		for(int i=0; i<10; i++) {
			//i값 출력
			System.out.println(i);
			try {
				//JVM 종료 요청
				System.exit(i);
				// 5일때 JVM이 종료됨 
			} catch (SecurityException e ) {  }
		}
		
	}

}
