package B3.Day14;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int value = scanner.nextInt();
                if (value == 0) {
                    sum++;
                }
            }

            // 주사위 값 중 0의 개수에 따라 결과 출력
            switch (sum) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
        }
    }
}
