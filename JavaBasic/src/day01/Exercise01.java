package day01;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		String name;
		int age;
		String classNum;
		int kor, eng, math;
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		name = scan.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		age = scan.nextInt();

		scan.nextLine();

		System.out.print("���� �Է��ϼ���: ");
		classNum = scan.nextLine();

		System.out.print("���� ������ �Է��ϼ���: ");
		kor = scan.nextInt();

		System.out.print("���� ������ �Է��ϼ���: ");
		eng = scan.nextInt();

		System.out.print("���� ������ �Է��ϼ���: ");
		math = scan.nextInt();

		//String + ~~~ �� �ϸ� String~~~ �� �����
		//�ϳ��� String�� �ȴ�.
		//3 + 5 -> 8 �� �ǵ� �ϳ��� ������
		System.out.printf("�л��̸�: %s\n", name);
		System.out.printf("����: %d\n", age);
		System.out.printf("��: %s��\n", classNum);
		System.out.printf("��������: %d��, ��������: %d��, "
				+ "��������: %d��", kor, eng, math);
		
	}
}
