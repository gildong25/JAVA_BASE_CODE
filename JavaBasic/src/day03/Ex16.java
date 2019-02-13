/** 소수 판별하기
 * 	1과 자기 자신만을 인수로 갖는 수 
 * 	(count가 2인 경우만 소수로 판별)
 */

package day03;

public class Ex16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;	// count가 for문 내부에서만 돌게됩니다.

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i + "는 소수입니다.");
			}
		}

	}

}
