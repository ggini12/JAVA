/*5. Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
--------------------------------
정수 3개를 입력하시오 >> 4 3 5
삼각형이 됩니다.
*/
package report;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class report5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("세 정수를 입력하시오 >> ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        if(arr[0] + arr[1] > arr[2]) {
            System.out.println("삼각형이 됩니다.");
        }
        else {
            System.out.println("삼각형이 되지 않습니다.");
            scan.close();
        }
    }


}