package B4.Day17;

import java.util.Scanner;

public class BOJ13752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            for (int j = 1; j <= A; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
