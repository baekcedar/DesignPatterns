package Proxy;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bbs bbs = new Bbs();
		
		System.out.println(bbs.read());
		BbsProxy bbsProxy = new BbsProxy();
		
		System.out.println(bbsProxy.read());
		
	}

}
