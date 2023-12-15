/*1. Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. $1 = 1100으로 가정하고 계산하라.
------------------------------------
원화를 입력하세요(단위 원) >> 3300
3300원은 $3.0입니다.
*/
package report;

import java.util.Scanner;

public class report1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화를 입력해주세요 : ");
		int money = scan.nextInt();
		double dal = money/1100;
		
		System.out.println(money + " 원은 $"+ dal+"입니다");
		scan.close();
	}
}
