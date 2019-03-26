package step06;

public class Earth {
	static final double EARTH_RADIUS = 6400;  // 지구의 반지름은 변하지 않는 값이므로 상수로 선언. 
	static final double EARTH_SURFACE_AREA; // 지구의 표면적. 4*파이*r제곱이 공식이므로 변하지 않는 값. 상수 선언 
	
	static {
		EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;  
	}
  //단순한 값일 경우 선언 시에 초기값을 주지만, 복잡한 초기화일 경우 정적 블록에서도 초기화 가능. 
}
