package day04;

// 클래스 만들기
public class Car {
	// 필드만들기
	String carType;
	private int carYear; // 게터 세터로만 접근이 가능.
	String carColor;
	int carMaxSpeed;

	public Car() { // 기본 생성자
		System.out.println("기본생성자");
		this.carColor = "회색";
		this.carType = "티코";
		this.carMaxSpeed = 120;
		this.carYear = 1995;
	}

	public Car(String carType, int carYear, String carColor, int carMaxSpeed) {
		System.out.println("파라미터 생성자");
		this.carColor = carColor;
		this.carType = carType;
		this.carMaxSpeed = carMaxSpeed;
		this.carYear = carYear;
	}
	
	// 생성자 오버로딩
	public Car(String carType) {
		this.carType = carType;
	}

	// 세터로 CarYear을 세팅한다.
	public void setCarYear(int carYear) {
		this.carYear = carYear; // this 는 자기 자신
	}

	// 게터로 값을 가져온다.
	public int getCarYear() {
		return this.carYear;
	}

	// 메소드만들기
	public void startEngine() {
		System.out.println(carType + "시동을 건다.");
	}

	public void start() {
		System.out.println("출발을 한다.");
	}

	public void stop() {
		System.out.println("정지를 한다.");
	}

	public void park() {
		System.out.println("주차를 한다.");
	}

	public void stopEngine() {
		System.out.println(carType + "엔진을 끈다.");
	}

}
