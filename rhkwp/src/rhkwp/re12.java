/*12. 다음과 같이 작동하는 Add.java를 작성하라. 명령행 인자 중에서 정수 만을 골라 합을 구하라.*/
package rhkwp;

public class re12 {

public static void main(String[] args) {
// TODO Auto-generated method stub
int sum = 0;

for(int i = 0; i < args.length; i++) {
try {

sum += Integer.parseInt(args[i]);

}
catch(NumberFormatException e) {
args[i] = "0";
}
}
System.out.println(sum);
}
}
