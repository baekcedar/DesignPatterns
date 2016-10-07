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
				name 	+ 	"(��)�� ���� "
				+ from 	+	"���� "
				+ to 	+ 	"���� �̵��Ѵ�.");
		
	}
	
}
