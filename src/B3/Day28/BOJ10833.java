package B3.Day28;

import java.util.Scanner;

public class BOJ10833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            sum = sum + (B % A);
        }
        System.out.println(sum);
    }
}
