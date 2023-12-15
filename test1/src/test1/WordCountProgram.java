package test1;
//2번 문제
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">> ");
            String inputLine = scanner.nextLine();

            if (inputLine.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            // 1. StringTokenizer 사용
            int wordCount = countWordsWithTokenizer(inputLine);
            System.out.println("어절 개수는 " + wordCount);
        }

        scanner.close();
    }

    private static int countWordsWithTokenizer(String inputLine) {
        StringTokenizer tokenizer = new StringTokenizer(inputLine, " ");
        return tokenizer.countTokens();
    }
}