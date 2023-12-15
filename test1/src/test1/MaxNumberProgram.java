package test1;
//3번 문제
import java.util.Scanner;
import java.util.Vector;

public class MaxNumberProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.print("정수(-1이 입력될 때까지)>> ");

        while (true) {
            int inputNumber = scanner.nextInt();

            if (inputNumber == -1) {
                break;
            }

            numbers.add(inputNumber);
        }

        if (!numbers.isEmpty()) {
            int maxNumber = findMaxNumber(numbers);
            System.out.println("가장 큰 수는 " + maxNumber);
        } else {
            System.out.println("입력된 수가 없습니다.");
        }

        scanner.close();
    }

    private static int findMaxNumber(Vector<Integer> numbers) {
        int maxNumber = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        return maxNumber;
    }
}
