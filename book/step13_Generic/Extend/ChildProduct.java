package step13_Generic.Extend;

public class ChildProduct<T,M,C> extends Product<T,M> { 
	// Product 제네릭 클레스의 하위(자식) 클래스 ChildProduct클래스 선언 
	// 타입파라미터를 하나 더 가졌음 
	private C company;
	public C getCompany() {
		return this.company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}
	
}
