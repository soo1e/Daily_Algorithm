package Day5;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
