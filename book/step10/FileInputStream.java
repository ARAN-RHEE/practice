package step10;

public class FileInputStream implements AutoCloseable{  // try-with-resources를 이용하려면 AutoCloseable 인터페이스를 구현해야함 
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println(file+"을 닫습니다");
	}

}
