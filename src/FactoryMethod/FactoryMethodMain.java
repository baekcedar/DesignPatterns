package FactoryMethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
	
	
		Car car1 = CarFactory.newInstace("Bmw");
		car1.setDestination("����", "����");
		car1.drive();
		
		Car car2 = CarFactory.newInstace("Porsche");
		car2.setDestination("����", "����");
		car2.drive();
		
		Car car3 = CarFactory.newInstace("Volvo");
		car3.setDestination("����", "����");
		car3.drive();
		
		
	}

}
