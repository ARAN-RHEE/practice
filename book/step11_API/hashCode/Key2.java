package step11_API.hashCode;

public class Key2 {
	public int number;
	
	public Key2(int number) {
		this.number = number;
	}
	
	
	@Override
	public int hashCode() {
		return number;
	}
}
