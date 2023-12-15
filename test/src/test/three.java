/*정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하시오. 그리고 배열에 든 숫자들과 평균을 출력하시오.*/
package test;

public class three {
	public static void main(String[] args) {
		double sum = 0;
		int a[] = new int[10];
		for(int i=0; i<a.length; i++) {
			a[i]=(int)(Math.random()*10+1);
		}
		System.out.print("랜덤한 정수들 : ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			sum += a[i];
		}
		System.out.println();
		System.out.print("평균은 : "+sum/a.length +" 입니다." );
	}
}

