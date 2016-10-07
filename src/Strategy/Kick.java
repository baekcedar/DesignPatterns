package Strategy;

public class Kick implements StrategyInterface {
	String str = null;
	public Kick(String str){
		this.str = str;
		
	}
	@Override
	public void useStrategy() {
		System.out.println(str);

	}

}
