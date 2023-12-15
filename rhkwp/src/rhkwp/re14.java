/*14. 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

string course[] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
int score[] = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다.*/
package rhkwp;

import java.util.Scanner;

public class re14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	      int score[]  = {95, 88, 76, 62, 55};
	      String name="";
	      int i =0;
	      
	      while(true) {
	         System.out.print("과목 이름 >> ");
	         name = scan.next();
	         if(name.equals("그만")) break;
	         for(i=0;i<course.length; i++) {
	            if(course[i].equals(name)) {
	               System.out.println(course[i]+"의 점수는 "+score[i]);
	               break;
	            }
	         }
	         if(i == course.length) {
	            System.out.println("없는 과목입니다.");
	         }
	      }
	      
	      scan.close();
	   }
	   
}

