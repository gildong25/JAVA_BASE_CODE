package day04;

public class arrEx01 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� �迭 �����
		String[] arr = new String[5];
		arr[3] = "3rd String";

//		arr[5] = "5st String";	// �迭�� 0���� �����ϱ� ������ 5��°�� ������ ����(0~4)

		System.out.println(arr[3]); // ����
//		System.out.println(arr[5]); // �Ұ��� : java.lang.ArrayIndexOutOfBoundsException

		// �迭�� ������� ������ ����
		int size = 8;
		String[] arr2 = new String[size];
		System.out.println(arr.length); // arr.length : �迭�� ���̸� �� �� �ִ�.

		// ���� �迭 ����� (2���� �迭)
		int[][] arr3 = new int[5][10];

		// ���� �迭�� �� �ֱ�
		int num1 = 150;
		arr3[2][4] = num1;
		System.out.println(arr3[2][4]);

	}

}
