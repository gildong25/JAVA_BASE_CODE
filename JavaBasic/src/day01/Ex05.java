package day01;
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = scan.nextLine();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = scan.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���: ");
		float height = scan.nextFloat();
		
		System.out.print("�����Ը� �Է��ϼ���: ");
		float weight = scan.nextFloat();
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("Ű: " + height);
		System.out.println("������: " + weight);
	}
}
