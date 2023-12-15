/*7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.*/
package rhkwp;

public class re7 {
	public static void main(String[] args) {
		
	
	int n[]= new int[10];
	int sum=0;
	
	//배열 값 랜던 삽입
	for(int i=0; i<10; i++) {
		n[i]=(int)(Math.random()*10+1);  //0-1사이의 수를 랜던으로 반환
		sum+=n[i];
	}
	
	System.out.print("랜덤한 정수들 : ");
	for(int i= 0; i<10; i++) 
		System.out.print(n[i]+" ");
	
	System.out.println();
	System.out.println("평균은 "+(double)sum/n.length);
	
}
}
