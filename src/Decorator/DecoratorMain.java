package Decorator;
/*
 * 
 *  ���Ͻ� ������ ���� ȣ���ϰ��� �ϴ� ��ü�� ������� �����ϴµ�
 * 	�ΰ����� ������ ������� ������ ��ģ��.
 *  *   
 * 
 */
public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BbsInterface bbs = new Bbs();
		System.out.println("Bbs:"+bbs.read());
		BbsInterface bbsDeco = new Decorator();
		System.out.println("BbsDeco:"+bbsDeco.read());
	}

}
