package step13_Generic.MultiType;

public class Product<T,M> {

	// 두 개 이상의 타입 파라미터 사용 
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.getModel();
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
