package B3.Day5;

import java.util.Scanner;

public class BOJ2441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = N-i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
