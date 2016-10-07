package Proxy;
/*
 * 프록시 패턴은 실제 호출하고자 하는 객체의 결과값은 그대로 유지한체 
 * 부가적인 동작을 해준다.
 */
public class BbsProxy implements BbsInterface{
	Bbs bbs;
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		System.out.print("Proxy:조회수가 1 증가되었습니다.");
		bbs = new Bbs();
		
		
		return bbs.read();
	}
	
		
}
