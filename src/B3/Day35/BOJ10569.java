package B3.Day35;

import java.util.Scanner;

public class BOJ10569 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Z = 0;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            Z = 2 - A + B;
            System.out.println(Z);
        }
    }
}
