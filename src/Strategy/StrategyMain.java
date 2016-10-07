package Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		StrategyInterface si = null;
		/*
		 * 1. Strategy
		 * 2. Context
		 * 3. Client 
		 */		
		Context  context = StrategyFactoty.newContext();
		si = StrategyFactoty.newContetxt("kick");
		context.runContext(si);
		si = StrategyFactoty.newContetxt("punch");
		context.runContext(si);
		si = StrategyFactoty.newContetxt("run");
		context.runContext(si);
	
	}

}
