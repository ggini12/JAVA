/*7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다. (100, 100)과 (200, 200)의 두 점으로 이루어진 사각형이 있을 때,
 Scanner를 이용하여 정수 x와 y를 입력받고 점 (x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
-----------------------------------
점 (x, y)의 좌표를 입력하시오 >> 150 150
(150, 150)는 사각형 안에 있습니다.
*/
package report;

import java.util.Scanner;

public class report7 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("(x,y)의 좌표를 입력하세요 : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	if(100<=x && 200>=x && 100<=y&&200>=y)
		System.out.println("(" +x+", "+y+") 는 사각형 안에 있습니다");
	else
		System.out.println("(" +x+", "+y+") 는 사각형 안에 없습니다");
	scan.close();

}
}
