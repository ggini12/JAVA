/*16. 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음과 같다. 독자부터 먼저 시작한다. 독자가 가위 바위 보 중에 하나를 입력하고 
 * <Enter>키를 치면 프로그램은 가위 바위 보 중에 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다. 
 * 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝낸다.

컴퓨터와 가위 바위 보 게임을 합니다.
가위 바위 보>>바위
사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.
가위 바위 보>>바위
사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.
가위 바위 보>>그만
게임을 종료합니다.....*/
package rhkwp;

import java.util.Scanner;

public class re16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
	      String UserSelect, ComSelect;
	      int n; //컴퓨터가 내는 것
	      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
	      do {
	         System.out.print("가위 바위 보! >> ");
	         UserSelect = scan.next();
	         if(UserSelect.equals("그만")) break;
	         n = (int)(Math.random()*3);
	         ComSelect=str[n];
	         if(UserSelect.equals("가위")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
	               continue;
	            }
	         }
	         else if(UserSelect.equals("바위")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
	               continue;
	            }
	         }
	         else if(UserSelect.equals("보")) {
	            if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
	               continue;
	            }
	         }
	         System.out.print("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" ");
	      }while(true);
	      System.out.println("게임을 종료합니다...");
	      scan.close();
	   }

	}