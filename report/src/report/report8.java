/*8. 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받아 
 * (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
--------------------------------
다음은 점 (x, y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴하는 메소드이다. 이 메소드를 활용하라.
public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
   if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
   return true;
   else
   return false;
*/
package report;

import java.util.Scanner;

public class report8 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		   if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
		   return true;
		   else
		   return false;
}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 점 (x1, y1)의 좌표를 입력하시오 >> ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("두번째 점 (x2, y2)의 좌표를 입력하시오 >> ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        if(inRect(x1, y1, 100, 100, 200, 200) == true || inRect(x2, y2, 100, 100, 200, 200) == true ||
                inRect(x1, y2, 100, 100, 200, 200) == true || inRect(x2, y1, 100, 100, 200, 200) == true || 
                (x1<=100 && y1<=100 && x2>=200 && y2>=200) || (x2<=100 && y2<=100 && x1>=200 && y1>=200) ||
                (x1<=100 && y1>=200 && x2>=200 && y2<=100) || (x2<=100 && y2>=200 && x1>=200 && y1<=100)) {
            System.out.println("사각형끼리 충돌합니다.");
        }
        else {
            System.out.println("사각형끼리 충돌하지 않습니다.");
            scan.close();
        }
    }
}