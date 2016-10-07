package Decorator;

public class Decorator implements BbsInterface{
	Bbs bbs;
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		
		bbs = new Bbs();
		
		
		return "Ãß°¡"+bbs.read();
	}

}
