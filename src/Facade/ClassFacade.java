package Facade;

public class ClassFacade {
	Door door 			= new Door();
	Light light 		= new Light();
	Computer computer 	= new Computer();
	public void start(){
		//수업을 시작 하는 함수
		System.out.println("--- 수업을 시작합니다 .---");
		door.open();
		light.turnOn();
		computer.turnOn();
	}
	public void end(){
		//수업을 종료하는 함수
		System.out.println("--- 수업을 시작합니다 .---");		
		computer.turnOff();
		light.turnOff();		
		door.close();
		
	}
}
