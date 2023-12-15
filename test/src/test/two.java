/*2. 다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
---------------------
1
1 2 3
1
1 2 3 4
1 2*/
package test;

public class two {
	public static void main(String[] args) {
		int a[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
