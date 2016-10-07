package Observer;
import java.util.ArrayList;
import java.util.Scanner;

public class ObserverMain {

	public static void main(String[] args) {
	
		TargetJob target = new TargetJob();
		new Binary(target);
		Scanner scan = new Scanner(System.in);
		System.out.println(" -- 0 �Է½� ���� --");
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
	// ���� �½�ũ�� �ٶ󺸴� ���������� ����� �δ� �迭 
	private ArrayList<Observer> observers = new  ArrayList<>();
	int number = 0 ;
	
	// �������� ���
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	// �����½�ũ�� ���� �Է��ϰ�, ��������� ������ �˸��� �޼��带 ȣ��
	public void setNumber(int number){
		this.number = number;
		notifyChanged();
	}
	
	// �����½�ũ�� ���ܻ����� ������ ��ü �������� �˷��ش�.
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