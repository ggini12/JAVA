/*12. 사칙연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 구분하여 입력한다. 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
---------------------------------------------
연산 >> 2 + 4
2+4의 계산 결과는 6

1)연산 식을 구분할 때 if~else문을 이용하여 프로그램을 작성하라.
2)연산 식을 구분할 때 switch문을 이용하여 프로그램을 작성하라.
---------------------------------------------
연산자는 scanner.next()를 이용하여 문자열로 입력받으면 된다. 문자열 s가 "+"와 같은지 검사하려면 if(s.equals("+"))를 이용하며, true이면 s와 "+"가 같다.
*/
package report;

import java.util.Scanner;
public class report12 {
// 연산자 : an operator , 결과 : result
	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner s=new Scanner(System.in);
		int op1=s.nextInt();
		String op=s.next();
		int op2=s.nextInt();
		
		int res=0;
		if(op.equals("+"))
			res=op1+op2;
		else if(op.equals("-"))
			res=op1-op2;
		else if(op.equals("*"))
			res=op1*op2;
		else if(op.equals("/")) {
			if(op2==0) {
				System.out.print("0으로 나눌 수 없습니다.");
				s.close();
				return;
			}
			else
				res=op1/op2;
			}
		else {
			System.out.print("사칙연산이 아닙니다.");
			s.close();
			return;
		}
		System.out.println(op1+op+op2+"의 계산결과는"+res);
		s.close();
	}
}
 