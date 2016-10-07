package FactoryMethod;

public class CarFactory {
	public static Car newInstace(String key){
		
		if(key.equals("Porsche")){
			return  new Porsche("Porsche");
			
		}else if(key.equals("Bmw")){
			return new Bmw("BMW");
	
		}else if(key.equals("Volvo")){			
			return new Volvo("VOLVO");
			
		}
		
		else{
			return null;
		}
		
	}
}
