package day02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("1~3������ ���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
		case 2:
		case 3:
			System.out.println(num + " �Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է� �Ǿ����ϴ�.");
			break;
		}
		sc.close();
	}

}
