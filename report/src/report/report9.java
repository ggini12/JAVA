/*9. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
-----------------------------------------------
원의 중심과 반지름 입력 >> 10 10 6.5
점 입력 >> 13 13
점 (13.0, 13.0)는 원 안에 있다.
-----------------------------------------------
중심에서 점 (x, y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다. 변수 x에 대한 제곱근의 값은 Math.sqrt(x)를 이용하면된다.
*/
package report;

import java.util.Scanner;

public class report9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력 : ");
        float x1 = scan.nextInt();
        float y1 = scan.nextInt();
        float r = scan.nextInt();
        System.out.print("점 입력 : ");
        float x2 = scan.nextInt();
        float y2 = scan.nextInt();
        float d = (float) Math.sqrt(Math.pow((float)(x1-x2), 2)+Math.pow((float)(y1-y2), 2));
        if (d<=r) {
            System.out.println("점 ("+x2+", "+y2+")는 원 안에 있다.");
        }
        else {
            System.out.println("점 ("+x2+", "+y2+")는 원 안에 없다.");
            scan.close();
        }
    }

}
