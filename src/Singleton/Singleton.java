package Singleton;

public class Singleton {	
	
	//static 으로 프로그램이 처음 구동할때만 메모리에 올라옴.
	private static Singleton instance = new Singleton();
	
	private Singleton(){ // 생성을 못하게 막아줌
		
	}
	
	//사용자는 필요할때 getinstance() 만 사용.
	public synchronized static Singleton getinstance(){		
		return instance;		
	}
}
//속도면에서 좋음.