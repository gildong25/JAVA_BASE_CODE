package day04;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.carColor = "빨강";
		myCar.carType = "모닝";
		myCar.carMaxSpeed = 150;
		myCar.setCarYear(2019); // 세터로 값을 셋팅 해준다.

		myCar.startEngine();
		myCar.stopEngine();
//		myCar.start();
//		myCar.stop();
//		myCar.park();

		// 게터로 값을 받아온다.
		// System.out.println(myCar.getCarYear());

		// yourCar 만들기 - 기본생성자로 만들기
		Car yourCar = new Car();
		yourCar.startEngine(); // 값을 설정 안해준다면 기본 생성자의 내용이 나온다!
		
		// ourCar 만들기 - 파라미터로 만들기
		Car ourCar = new Car("빵빵이", 2019, "노랑", 800);
		ourCar.startEngine();
		
		// otherCar 만들기 - 오버로딩 확인하기
		Car otherCar = new Car("뿡뿡이");
		otherCar.startEngine();
	
	}
			

}
