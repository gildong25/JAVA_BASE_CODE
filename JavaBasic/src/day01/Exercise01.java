package day01;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		String name;
		int age;
		String classNum;
		int kor, eng, math;
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = scan.nextLine();
		System.out.print("나이를 입력하세요: ");
		age = scan.nextInt();

		scan.nextLine();

		System.out.print("반을 입력하세요: ");
		classNum = scan.nextLine();

		System.out.print("국어 점수를 입력하세요: ");
		kor = scan.nextInt();

		System.out.print("영어 점수를 입력하세요: ");
		eng = scan.nextInt();

		System.out.print("수학 점수를 입력하세요: ");
		math = scan.nextInt();

		//String + ~~~ 를 하면 String~~~ 가 연결된
		//하나의 String이 된다.
		//3 + 5 -> 8 이 되듯 하나로 합쳐짐
		System.out.printf("학생이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("반: %s반\n", classNum);
		System.out.printf("국어점수: %d점, 수학점수: %d점, "
				+ "영어점수: %d점", kor, eng, math);
		
	}
}
