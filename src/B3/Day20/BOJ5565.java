package B3.Day20;

import java.util.Scanner;

public class BOJ5565 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            int A = scanner.nextInt();
            N = N - A;
        }

        System.out.println(N);
    }
}
