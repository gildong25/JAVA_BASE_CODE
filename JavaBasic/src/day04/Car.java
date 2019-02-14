package day04;

// Ŭ���� �����
public class Car {
	// �ʵ常���
	String carType;
	private int carYear; // ���� ���ͷθ� ������ ����.
	String carColor;
	int carMaxSpeed;

	public Car() { // �⺻ ������
		System.out.println("�⺻������");
		this.carColor = "ȸ��";
		this.carType = "Ƽ��";
		this.carMaxSpeed = 120;
		this.carYear = 1995;
	}

	public Car(String carType, int carYear, String carColor, int carMaxSpeed) {
		System.out.println("�Ķ���� ������");
		this.carColor = carColor;
		this.carType = carType;
		this.carMaxSpeed = carMaxSpeed;
		this.carYear = carYear;
	}
	
	// ������ �����ε�
	public Car(String carType) {
		this.carType = carType;
	}

	// ���ͷ� CarYear�� �����Ѵ�.
	public void setCarYear(int carYear) {
		this.carYear = carYear; // this �� �ڱ� �ڽ�
	}

	// ���ͷ� ���� �����´�.
	public int getCarYear() {
		return this.carYear;
	}

	// �޼ҵ常���
	public void startEngine() {
		System.out.println(carType + "�õ��� �Ǵ�.");
	}

	public void start() {
		System.out.println("����� �Ѵ�.");
	}

	public void stop() {
		System.out.println("������ �Ѵ�.");
	}

	public void park() {
		System.out.println("������ �Ѵ�.");
	}

	public void stopEngine() {
		System.out.println(carType + "������ ����.");
	}

}
