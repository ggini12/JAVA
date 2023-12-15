/*10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
----------------------------------------------
첫번째 원의 중심과 반지름 입력 >> 10 10 3
두번째 원의 중심과 반지름 입력 >> 12 12 2
두 원은 서로 겹친다.
*/
package report;

import java.util.Scanner;

public class report10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력 : ");
        float x1 = scan.nextInt();
        float y1 = scan.nextInt();
        float r1 = scan.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력 : ");
        float x2 = scan.nextInt();
        float y2 = scan.nextInt();
        float r2 = scan.nextInt();
        float d = (float) Math.sqrt(Math.pow((float)(x1-x2), 2)+Math.pow((float)(y1-y2), 2));
        if(d<=(r1+r2)) {
            System.out.println("두 원은 서로 겹친다.");
        }
        else {
            System.out.println("두 원은 서로 겹치지 않는다.");
            scan.close();
        }
    }
}

