/*4. Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라. 다음은 e를 입력받았을 경우이다.*/
package rhkwp;

import java.util.Scanner;

public class re4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s;
		char c;
		
		System.out.print("소문자 알파벳을 입력해주세요 : ");
		s = scan.next();
		c = s.charAt(0);
		
		for(int i=0;i<=c-'a';i++) {
			for(char j='a';j<=c-i;j++) {
				System.out.print(j);
		}
		System.out.println();
	}
	scan.close();
	}
}
//잘모르겟음
