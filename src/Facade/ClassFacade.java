package Facade;

public class ClassFacade {
	Door door 			= new Door();
	Light light 		= new Light();
	Computer computer 	= new Computer();
	public void start(){
		//������ ���� �ϴ� �Լ�
		System.out.println("--- ������ �����մϴ� .---");
		door.open();
		light.turnOn();
		computer.turnOn();
	}
	public void end(){
		//������ �����ϴ� �Լ�
		System.out.println("--- ������ �����մϴ� .---");		
		computer.turnOff();
		light.turnOff();		
		door.close();
		
	}
}
