package step06_Class.Constructor;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff; 
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
		
	}
	
	void print() {
		System.out.println( channel + "번");
		System.out.println("음량" + volume);
	}
}
