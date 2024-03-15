package B3.Day36;

import java.util.Scanner;

public class BOJ2965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int max = Math.max(C - B, B - A) - 1;
        System.out.println(max);
    }
}
