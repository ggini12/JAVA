/*5.노래 한 곡을 나타내는 Song 클래스를 작성하시오. Song은 다음 필드로 구성된다.
6.노래 제목을 나타내는 title
7.가수를 나타내는 artist
8.노래가 발표된 연도를 나태내는 year
9.국적을 나태내는 country

또한 Song 클래스에 다음 생성자와 메소드를 작성하시오.
생성자 2개 : 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
노래 정보을 출력하는 show() 메소드
main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을 Song 객체로 출력하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하시오.
------------------
1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen*/
package test;

public class five {
    String artist;
    String title;
    int year;
    String country;

    public five() {}

    public five(String artist, String title, int year, String country) {
        this.artist=artist;
        this.title=title;
        this.year=year;
        this.country=country;
    }

    public void show() {
        System.out.println(year+" 년 "+country+" 국적의 "+artist+" 가 부른 "+title);
    }

    public static void main(String[] args) {
        five s1 = new five("ABBA", "Dancing Queen", 1978, "스웨덴");
        s1.show();
    }

}
