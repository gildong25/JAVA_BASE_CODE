package day04;

import java.util.Scanner;

public class Student {
	// ĸ��ȭ
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	private int kor;
	private int eng;
	private int math;

	// �̸� + ���� �����ֱ�
	public void showNameScore() {
		System.out.println("�̸�: " + this.name);
		System.out.println("��������: " + this.kor);
		System.out.println("��������: " + this.eng);
		System.out.println("��������: " + this.math);

	}

	// ���� + ��� �����ֱ�
	public void showSumAvg() {
		System.out.println("����: "+(this.kor+this.eng+this.math));
		System.out.println("���: "+(this.kor+this.eng+this.math)/(3.0f));
	}
}
