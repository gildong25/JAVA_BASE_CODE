/*** 
 * ���ѷ��� ����
 * �л��� ������ �޾� ����̾簡�� �����ִ� ���α׷��� ���弼��.
 * 	  ����1. ������ -1�̸� ���α׷��� �����մϴ�.
 */

package day03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;

		while (true) {
			System.out.print("������ �Է��ϼ���: ");
			N = sc.nextInt();
			switch (N / 10) {
			case 10:
			case 9:
				System.out.println("��");
				break;
			case 8:

				System.out.println("��");
				break;
			case 7:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("��");
				break;
			}
			if (N == -1) {
				break;
			}
		}
		sc.close();
	}

}
