/** ���ǹ� if-else �� ���� 2
 * �л��� ������ ������ �޾� ��� ���θ� ǥ���ϼ���
 * - ���� ������ ������ 210 �̸��Ͻ� : Ż��
 * - ���� ���� �ϳ��� 60 �̸��� �� : Ż��
 */

package day02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ �Է��ϼ���: ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		math = sc.nextInt();

		sum = kor + eng + math;

		if (sum < 210 || (kor < 60 || math < 60 || eng < 60)) {
			System.out.println("Ż���Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}

		sc.close();
	}

}
