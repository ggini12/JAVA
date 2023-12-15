/*3. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
--------------------------------------
금액을 입력하시오 >> 65376
오만원권 1매
만원권 1매
천원권 5매
백원 3개
오십원 1개
십원 2개
일원 6개
*/
package report;

import java.util.Scanner;

public class report3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요 : ");
		int money = scan.nextInt();
		int a = money/10000;
		int b = (money%10000)/1000; /*1000*/
		int c = (money%1000)/100;
		int d = (money%100)/10;
		int e = money%10; /*1*/
		int five = a/5; /*50000*/
		int four = a%5; /*10000*/
		int three = c/5; /*500*/
		int three2 = c%5; /*100*/
		int two = d/5; /*50*/
		int one = d%5; /*10*/
		
		System.out.println("5만원권 "+five+"매");
		System.out.println("1만원권 "+four+"매");
		System.out.println("천원권 "+b+"매");
		System.out.println("오백원 "+three+"개");
		System.out.println("백원 "+three2+"개");
		System.out.println("오십원 "+two+"개");
		System.out.println("십원 "+one+"개");
		System.out.println("일원 "+e+"개");
		scan.close();
	}
}
