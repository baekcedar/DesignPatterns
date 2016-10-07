package FactoryMethod;

public abstract class Car {

	private String name;
	private String from;
	private String to;
	
	public Car(String name){
		this.name = name;
	}
	public void setfrom(String from, String to){
		this.from = from;
		this.to = to;
	}
	public abstract void setDestination(String from, String to);
	
	public void drive(){
		System.out.println(
				name 	+ 	"(를)을 몰고 "
				+ from 	+	"부터 "
				+ to 	+ 	"까지 이동한다.");
		
	}
	
}
