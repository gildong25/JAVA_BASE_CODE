package day03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		int day = 0;
		String result = "";
		while (true) {
			// ���� ����ó��
			while (true) {
				System.out.print("���� �Է����ּ���(0�� ����): ");
				month = scan.nextInt();

				if (month >= 0 && month <= 12) {
					break;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է� ");
				}
			}
			if (month == 0) {
				break;
			}

			// ���� ����ó��
			while (true) {
				System.out.print("������ �Է��ϼ���(0�� ����): ");
				day = scan.nextInt();

				if (day >= 0 && day <= 31) {

					switch (month) {
					case 1:
						if (day >= 20) {
							result = "���� ";
						} else {
							result = "���� ";
						}
						break;
					case 2:
						if (day >= 19) {
							result = "����� ";
						} else {
							result = "���� ";
						}
						break;
					case 3:
						if (day >= 21) {
							result = "�� ";
						} else {
							result = "����� ";
						}
						break;
					case 4:
						if (day >= 20) {
							result = "Ȳ�� ";
						} else {
							result = "�� ";
						}
						break;
					case 5:
						if (day >= 21) {
							result = "�ֵ��� ";
						} else {
							result = "Ȳ�� ";
						}
						break;
					case 6:
						if (day >= 22) {
							result = "�� ";
						} else {
							result = "�ֵ��� ";
						}
						break;
					case 7:
						if (day >= 23) {
							result = "���� ";
						} else {
							result = "�� ";
						}
						break;
					case 8:
						if (day >= 23) {
							result = "ó�� ";
						} else {
							result = "���� ";
						}
						break;
					case 9:
						if (day >= 24) {
							result = "õĪ ";
						} else {
							result = "ó�� ";
						}
						break;
					case 10:
						if (day >= 23) {
							result = "���� ";
						} else {
							result = "õĪ ";
						}
						break;
					case 11:
						if (day >= 23) {
							result = "��� ";
						} else {
							result = "���� ";
						}
						break;
					case 12:
						if (day >= 25) {
							result = "���� ";
						} else {
							result = "��� ";
						}
						break;
					}
					System.out.printf("%d�� %d���� %s�ڸ� �Դϴ�.\n", month, day, result);
					break;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է� ");
				}
			}
			if (day == 0) {
				break;
			}
		}
		scan.close();
	}
}
