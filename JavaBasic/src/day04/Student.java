package day04;

import java.util.Scanner;

public class Student {
	// 캡슐화
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

	// 이름 + 점수 보여주기
	public void showNameScore() {
		System.out.println("이름: " + this.name);
		System.out.println("국어점수: " + this.kor);
		System.out.println("수학점수: " + this.eng);
		System.out.println("영어점수: " + this.math);

	}

	// 총점 + 평균 보여주기
	public void showSumAvg() {
		System.out.println("총점: "+(this.kor+this.eng+this.math));
		System.out.println("평균: "+(this.kor+this.eng+this.math)/(3.0f));
	}
}
