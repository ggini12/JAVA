package test1;
//4번 문제
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PointManagementProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pointMap = new LinkedHashMap<>(); // LinkedHashMap 사용

        System.out.println("** 포인트 관리 프로그램입니다. **");

        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                break;
            }

            String[] inputArray = input.split(" ");
            if (inputArray.length != 2) {
                System.out.println("올바른 형식으로 입력하세요.");
                continue;
            }

            String name = inputArray[0];
            int points = 0;

            try {
                points = Integer.parseInt(inputArray[1]);
            } catch (NumberFormatException e) {
                System.out.println("포인트는 정수로 입력하세요.");
                continue;
            }

            if (pointMap.containsKey(name)) {
                int currentPoints = pointMap.get(name);
                pointMap.put(name, currentPoints + points);
            } else {
                pointMap.put(name, points);
            }

            printPointMap(pointMap);
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

    private static void printPointMap(Map<String, Integer> pointMap) {
        System.out.print("(");

        for (String name : pointMap.keySet()) {
            System.out.print("(" + name + ", " + pointMap.get(name) + ")");
        }

        System.out.println(")");
    }
}