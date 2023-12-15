/*다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

string course[] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
int score[] = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다.
---------------------
과목 이름>>jaba
없는 과목입니다.
과목 이름>>java
java의 점수는 95
과목 이름>>안드로이드
안드로이드의 점수는 55
과목 이름>>그만

문자열을 비교하기 위해서는 String 클래스의 equals() 메소드를 이용해야 한다.

String name;
if(course[i.equals(name)){
       int n = score[i];
   ...
}*/
package test;

import java.util.Scanner;

public class four {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String course[] = {"JAVA", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};

		
		while(true){
			System.out.print("과목을 입력하세요 : ");
			String name = scan.next();
			if(name.equals("그만")) break;
			
			for(int i=0; i<course.length;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				else if(i==course.length-1) {
					System.out.print("없는 과목입니다.\n");
			}
		}

	}
		scan.close();
}
}