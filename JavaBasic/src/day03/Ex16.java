/** �Ҽ� �Ǻ��ϱ�
 * 	1�� �ڱ� �ڽŸ��� �μ��� ���� �� 
 * 	(count�� 2�� ��츸 �Ҽ��� �Ǻ�)
 */

package day03;

public class Ex16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;	// count�� for�� ���ο����� ���Ե˴ϴ�.

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");
			}
		}

	}

}
