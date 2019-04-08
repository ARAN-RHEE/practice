package step14.Lambda.TargetType;

@FunctionalInterface  // 있어도 되고 없어도 되지만, 사용하면 실수로 2개 이상의 메소드 선언하는것을 방지하기 좋음 
public interface MyFunctionalInterface3 {
	public int method(int x, int y);  // 리턴값, 파라미터개 2개 이상인 람다식 
	// 사용할 때 MyFunctionalInterface2 fi = (x,y) -> {실행문;} 의 형태로 작성 
}
