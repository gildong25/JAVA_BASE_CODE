package day02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이의 숫자를 입력하세요 : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
		case 2:
		case 3:
			System.out.println(num + " 입니다.");
			break;
		default:
			System.out.println("잘못 입력 되었습니다.");
			break;
		}
		sc.close();
	}

}
