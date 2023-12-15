/*11. 다음과 같이 작동하는 Average.java를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다.*/
package rhkwp;

public class re11 {

	 

public static void main(String[] args) {


int sum = 0;
int count = 0;

for(int i = 0; i < args.length; i++) {
sum +=Integer.parseInt(args[i]); // sum 연산을 위해String값으로 입력된 숫자를 int형으로 변환해 줍니다.
count++;}

 

System.out.println("평균은" + sum/count);

}

}
