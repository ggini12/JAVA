/*6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
----------------------------------
1~99 사이의 정수를 입력하시오 >> 36
박수짝짝
*/
package report;

import java.util.Scanner;


public class report6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     System.out.print("1~99 사이의 정수를 입력하시오 >> ");
	        int a = scan.nextInt();
	        int b = (a/10);
	        int c = (a%10);
	        if(a>=1 && a<100) {
	            if(a>=1 && a<10) {
	                if (a%3 == 0) {
	                    System.out.println("박수짝");
	                }
	            }
	            else {
	                if(c == 0) {
	                    if(b%3 == 0) {
	                        System.out.println("박수짝");
	                    }
	                }
	                else {
	                    if(b%3 == 0 && c%3 == 0) {
	                        System.out.println("박수짝짝");
	                    }
	                    else if(b%3 == 0 || c%3 == 0) {
	                        System.out.println("박수짝");
	                    }
	                }
	            }
	            }
	            else {
	                System.out.print("잘못된 입력입니다.");
	                }
	        }
	}
