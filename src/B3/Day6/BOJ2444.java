package B3.Day6;

import java.util.Scanner;

public class BOJ2444 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            // 상단 부분 별 찍기
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 하단 부분 별 찍기
            for (int i = N - 1; i >= 1; i--) {
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
