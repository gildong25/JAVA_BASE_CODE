package day02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해 주세요: ");
		month = sc.nextInt();

		if (month >= 1 && month <= 12) {
			switch (month) {
			case 2:
				System.out.println(month + "월은 28일 까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월은 30일 까지 있습니다.");
				break;
			default:
				System.out.println(month + "월은 31일 까지 있습니다.");
				break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
