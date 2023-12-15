/*3. Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 다음은 5를 입력받았을 경우이다.*/
package rhkwp;

import java.util.Scanner;

public class re3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("정수를 입력해주세요 : ");
		n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
