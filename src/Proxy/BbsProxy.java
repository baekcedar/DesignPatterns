package Proxy;
/*
 * ���Ͻ� ������ ���� ȣ���ϰ��� �ϴ� ��ü�� ������� �״�� ������ü 
 * �ΰ����� ������ ���ش�.
 */
public class BbsProxy implements BbsInterface{
	Bbs bbs;
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		System.out.print("Proxy:��ȸ���� 1 �����Ǿ����ϴ�.");
		bbs = new Bbs();
		
		
		return bbs.read();
	}
	
		
}
