package day02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ���: ");
		month = sc.nextInt();

		if (month >= 1 && month <= 12) {
			switch (month) {
			case 2:
				System.out.println(month + "���� 28�� ���� �ֽ��ϴ�.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "���� 30�� ���� �ֽ��ϴ�.");
				break;
			default:
				System.out.println(month + "���� 31�� ���� �ֽ��ϴ�.");
				break;
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		sc.close();
	}

}
