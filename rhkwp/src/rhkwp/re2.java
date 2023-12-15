/*2. 다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};*/
package rhkwp;

public class re2 {
	public static void main(String[] args) {
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		for(int i=0;i<n.length;i++) {
			int[]inArr=n[i];
			for(int j=0;j<inArr.length;j++) {
				System.out.print(inArr[j]+"");
			}
			System.out.println();
		}
	}
}
