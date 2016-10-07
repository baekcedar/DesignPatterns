package FactoryMethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
	
	
		Car car1 = CarFactory.newInstace("Bmw");
		car1.setDestination("서울", "대전");
		car1.drive();
		
		Car car2 = CarFactory.newInstace("Porsche");
		car2.setDestination("서울", "대전");
		car2.drive();
		
		Car car3 = CarFactory.newInstace("Volvo");
		car3.setDestination("서울", "대전");
		car3.drive();
		
		
	}

}
