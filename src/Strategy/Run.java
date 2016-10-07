package Strategy;

public class Run implements StrategyInterface {
	String str = null;
	public Run(String str){
		this.str = str;
	}
	@Override
	public void useStrategy() {
		System.out.println(str);

	}

}
