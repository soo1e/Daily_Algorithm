package B3.Day20;

import java.util.Scanner;

public class BOJ2903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 3;
        for (int i = 2; i <= N; i++) {
            num = num * 2 - 1;
        }
        System.out.println(num * num);
    }
}
