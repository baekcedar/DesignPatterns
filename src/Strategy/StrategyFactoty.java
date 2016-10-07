package Strategy;

public class StrategyFactoty {
	public static StrategyInterface newContetxt(String key){
		StrategyInterface strategy = null;
		
		if(key.equals("run")){			
			strategy = new Run(key);
			return strategy;
		}else if(key.equals("punch")){
			strategy = new Punch(key);
			return strategy;
		}else if(key.equals("kick")){
			strategy = new Kick(key);
			return strategy;
		}else{
			return null;
		}
	}
	public static Context newContext(){
		return new Context();
	}
}
