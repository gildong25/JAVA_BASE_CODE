package day04;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.setName("���翵");
		stu1.setKor(90);
		stu1.setEng(80);
		stu1.setMath(70);

		stu1.showNameScore();
		stu1.showSumAvg();
		
		// �迭 �����
		int[] arr = new int[5];
		Student[] arr2 = new Student[5];
		
		// �迭 �ʱ�ȭ
		arr2[0] = new Student();
		// �迭�� ���ֱ�
		arr2[0].setName("��ö��");
		arr2[0].setEng(100);
		arr2[0].setKor(60);
		arr2[0].setMath(45);
		
		
		arr2[0].showNameScore();
		arr2[0].showSumAvg();
		
		
		
		// ���� �ڵ�
		Scanner sc = new Scanner(System.in);
		int[][] stuScore = new int[5][4];
		String[] score = new String[4];
		score[0] = "�̸�";
		score[1] = "��������";
		score[2] = "��������";
		score[3] = "��������";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < score.length; j++) {
				System.out.print((i + 1) + "��° �л��� " + score[j] + " �Է����ּ���: ");
				stuScore[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < score.length; j++) {
				if(j>0)
				System.out.print((i + 1) + "��° �л��� " + score[j]+"��" + stuScore[i][j]+"�Դϴ�");
				System.out.println();
			}
			System.out.println();
			System.out.println(i+"��° �л��� ������ "+"����� ");
		}

	}

}
