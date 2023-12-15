/*10. 4X4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.*/
package rhkwp;

public class re10 {
	public static void main(String[] args) {
		 int arr[][] = new int[4][4];
	      int x, y, result=0;//result는 랜덤 생성 갯수

	      while(result < 10) {
	         x = (int)(Math.random()*4); //x에 0~4까지의 랜덤 수 넣기
	         y = (int)(Math.random()*4); //y에 0~4까지의 랜덤 수 넣기
	         if(arr[y][x]==0) { //arr[x][y]에 값이 없으면 랜덤 수 넣기
	            arr[y][x] = (int)(Math.random()*10+1);
	            result++;
	         }
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }

	}

