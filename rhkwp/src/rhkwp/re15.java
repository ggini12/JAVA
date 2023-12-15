/*15. 다음은 2개의 정수를 입력 받아 곱을 구하는 Multiply 클래스이다.
 * 다음과 같이 실행할 때 프로그램은 10과 5를 곱해 50을 출력한다.
곱하고자 하는 두 수 입력 >>10 5
10x5=50

하지만 다음과 같이 실수를 입력하였을 때, 예외가 발생한다.
곱하고자 하는 두 수 입력 >>2.5 4*/
package rhkwp;

import java.util.Scanner;
import java.util.InputMismatchException;
public class re15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
	           System.out.print("곱하고자 하는 두 수 입력 >> ");
	           try {
	              int n = scan.nextInt();
	             int m = scan.nextInt();
	              System.out.print(n + "x" + m + "=" + n*m);
	              break;
	           }catch(InputMismatchException e) {
	               System.out.println("실수는 입력하면 안됩니다.");
	               scan.nextLine();
	            }
	         }
	         scan.close();
	     }
	     
	 }