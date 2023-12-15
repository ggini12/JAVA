/*8. 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
 *  이곳에 1에서 100까지의 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.*/
package rhkwp;

import java.util.Scanner;

public class re8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int arr[];
	      int num;
	      
	      System.out.print("정수 몇개? : ");
	      num = scan.nextInt();
	      
	      arr = new int[num];
	      for(int i=0; i<arr.length; i++) {
	         int tmp = (int)(Math.random()*100+1);
	         int chk = 0;
	         for(int j=0; j<arr.length; j++) {
	        	 if(tmp == arr[j]) {
	        		 chk=1;
	        		 break;
	        	 }
	         }
	         if(chk == 1) {
	        	 i--;
	        	 continue;
	         }
	         arr[i] = tmp;
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         if(i%10 == 0 && i != 0) System.out.println();
	         System.out.print(arr[i] + " ");
	      }
	      scan.close();
	   }
	}