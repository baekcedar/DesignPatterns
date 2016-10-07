package Strategy;

public class Punch implements StrategyInterface {
	String str = null;
	public Punch(String str){
		this.str = str;
	}
	@Override
	public void useStrategy() {
		System.out.println(str);

	}

}
