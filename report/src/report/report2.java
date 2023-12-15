/*2. Scanner클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
------------------------------
2자리수 정수 입력(10~99) >> 77
Yes! 10의 자리와 1의 자리가 같습니다.
*/
package report;

import java.util.Scanner;

public class report2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("2자리수 정수(10~99)를 입력해주세요 : ");
        int num = scan.nextInt();
        
        if(num/10<10) {
        	if(num/10==0) 
        		System.out.println("2자리수 정수가 아닙니다");
        		else if(num/10==num%10) 
        			System.out.println("YES! 10의 자리와 1의 자리가 같습니다");
        		else if(num/10!=num%10) 
        			System.out.println("10의 자리와 1의 자리가 같지않습니다");
        		else
        			System.out.println("2자리 수 정수가 아닙니다");
        	scan.close();
        	
        }
	}
}
