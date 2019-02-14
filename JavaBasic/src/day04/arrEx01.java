package day04;

public class arrEx01 {

	public static void main(String[] args) {
		// 크기가 5인 배열 만들기
		String[] arr = new String[5];
		arr[3] = "3rd String";

//		arr[5] = "5st String";	// 배열은 0부터 시작하기 때문에 5번째는 오류가 난다(0~4)

		System.out.println(arr[3]); // 가능
//		System.out.println(arr[5]); // 불가능 : java.lang.ArrayIndexOutOfBoundsException

		// 배열의 사이즈는 변수로 가능
		int size = 8;
		String[] arr2 = new String[size];
		System.out.println(arr.length); // arr.length : 배열의 길이를 알 수 있다.

		// 다중 배열 만들기 (2차원 배열)
		int[][] arr3 = new int[5][10];

		// 다중 배열에 값 넣기
		int num1 = 150;
		arr3[2][4] = num1;
		System.out.println(arr3[2][4]);

	}

}
