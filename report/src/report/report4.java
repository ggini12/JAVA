/*4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.
------------------------
정수 3개 입력 >> 20 100 33
중간 값은 33
*/
package report;

import java.util.Scanner;

public class report4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력해주세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		   if(a>=b) {
	            if (a>=c) {
	                if (b>=c) {
	                    System.out.println(b);
	                }
	                else {
	                    System.out.println(c);
	                }
	            }
	            else {
	                System.out.println(a);
	            }
	        }
	        else {
	            if(b<=c) {
	                System.out.println(b);
	            }
	            else {
	                if (a>=c) {
	                    System.out.println(a);
	                }
	                else {
	                    System.out.println(c);
	                }
	            }
	        }
	    }
	}