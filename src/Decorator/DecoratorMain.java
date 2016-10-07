package Decorator;
/*
 * 
 *  프록시 패턴은 실제 호출하고자 하는 객체의 결과값은 전달하는데
 * 	부가적인 동작이 결과값에 영향을 미친다.
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
