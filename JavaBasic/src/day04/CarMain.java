package day04;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.carColor = "����";
		myCar.carType = "���";
		myCar.carMaxSpeed = 150;
		myCar.setCarYear(2019); // ���ͷ� ���� ���� ���ش�.

		myCar.startEngine();
		myCar.stopEngine();
//		myCar.start();
//		myCar.stop();
//		myCar.park();

		// ���ͷ� ���� �޾ƿ´�.
		// System.out.println(myCar.getCarYear());

		// yourCar ����� - �⺻�����ڷ� �����
		Car yourCar = new Car();
		yourCar.startEngine(); // ���� ���� �����شٸ� �⺻ �������� ������ ���´�!
		
		// ourCar ����� - �Ķ���ͷ� �����
		Car ourCar = new Car("������", 2019, "���", 800);
		ourCar.startEngine();
		
		// otherCar ����� - �����ε� Ȯ���ϱ�
		Car otherCar = new Car("�׻���");
		otherCar.startEngine();
	
	}
			

}
