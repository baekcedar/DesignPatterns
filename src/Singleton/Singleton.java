package Singleton;

public class Singleton {	
	
	//static ���� ���α׷��� ó�� �����Ҷ��� �޸𸮿� �ö��.
	private static Singleton instance = new Singleton();
	
	private Singleton(){ // ������ ���ϰ� ������
		
	}
	
	//����ڴ� �ʿ��Ҷ� getinstance() �� ���.
	public synchronized static Singleton getinstance(){		
		return instance;		
	}
}
//�ӵ��鿡�� ����.