package Observer;
import java.util.ArrayList;
import java.util.Scanner;

public class ObserverMain {

	public static void main(String[] args) {
	
		TargetJob target = new TargetJob();
		new Binary(target);
		Scanner scan = new Scanner(System.in);
		System.out.println(" -- 0 입력시 종료 --");
		while(true){
			System.out.println("Enter a Number");
			target.setNumber(scan.nextInt());
			if(scan.nextInt() == 0){
				scan.close();				
				System.exit(1);
			}
		}
		
	}

}

class TargetJob {
	// 현재 태스크를 바라보는 옵저버들을 등록해 두는 배열 
	private ArrayList<Observer> observers = new  ArrayList<>();
	int number = 0 ;
	
	// 옵저버를 등록
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	// 실행태스크에 값을 입력하고, 변경사항이 있음을 알리는 메서드를 호출
	public void setNumber(int number){
		this.number = number;
		notifyChanged();
	}
	
	// 실행태스크에 변겨사항이 있으면 전체 옵저버에 알려준다.
	private void notifyChanged(){
		for(Observer o : observers){
			o.update(number);
		}
	}
}

class Binary implements Observer {
	TargetJob target;
	public Binary(TargetJob t) {
		target = t;
		target.attach(this);
	}

	@Override
	public void update(int msg) {
		System.out.println("Binary : "+Integer.toBinaryString(msg));
		System.out.println("Hex : "+Integer.toHexString(msg));

	}
}