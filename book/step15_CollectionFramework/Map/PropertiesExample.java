package step15_CollectionFramework.Map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	//Properties는 key와 value의 타입을 String으로 제한한 컬렉션 
	
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8"); // 경로에 한글이 있을 경우 한글 복원 
		properties.load(new FileReader(path)); //프로퍼티 파일 읽기 
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
