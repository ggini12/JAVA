/*5. 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.*/
package rhkwp;

import java.util.Scanner;

public class re5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[10];
		
		System.out.print("양의 정수 10개를 입력하세요 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("3의 배수는 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
		scan.close();
	}
}
