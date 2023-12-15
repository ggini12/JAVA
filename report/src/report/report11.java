/*11. 숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12, 1, 2의 경우는 "겨울"을, 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
---------------------------------------------
달을 입력하시오(1~12) >> 9
가을
 
1)if-else문을 이용하여 프로그램을 작성하라.
2)switch문을 이용하여 프로그램을 작성하라.
*/
package report;

import java.util.Scanner;

public class report11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("달을 입력하시오(1~12) : ");
        int a = scan.nextInt();
        String month = "";
        switch(a) {
        case 1: month = "겨울";
        break;
        case 2: month = "겨울";
        break;
        case 3: month = "봄";
        break;
        case 4: month = "봄";
        break;
        case 5: month = "봄";
        break;
        case 6: month = "여름";
        break;
        case 7: month = "여름";
        break;
        case 8: month = "여름";
        break;
        case 9: month = "가을";
        break;
        case 10: month = "가을";
        break;
        case 11: month = "가을";
        break;
        case 12: month = "겨울";
        break;
        default: month = "잘못된 입력입니다.";
        break;
        }
        System.out.println(month);
        scan.close();
    }
}