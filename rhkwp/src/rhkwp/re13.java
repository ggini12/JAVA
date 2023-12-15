/*13. 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.*/
package rhkwp;

public class re13 {
	public static void main(String[] args) {
		int a, b; //a = 10의자리, b = 1의자리
	      
	      for (int i=1; i<100; i++) {
	         a = i/10;
	         b = i%10;
	         if((a == 3 || a == 6 || a == 9) && (b ==3 || b == 6 || b == 9) ) {
	            System.out.println(i + "박수 짝짝");
	         }
	         else if((a == 3 || a == 6 || a == 9) && (b !=3 || b != 6 || b != 9)) {
	            System.out.println(i + "박수 짝");
	         }
	         else if((a != 3 || a != 6 || a != 9) && (b ==3 || b == 6 || b == 9)) {
	            System.out.println(i + "박수 짝");
	         }
	      }
	   }

	}