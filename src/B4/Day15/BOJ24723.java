package B4.Day15;

import java.util.Scanner;

public class BOJ24723 {
    public static void main(String[] args) {
        // 현재 층의 모든 경우의 수는 바로 이전 층의 경우의 수 * 2
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = {1, 2, 4, 8 , 16, 32};
        System.out.println(A[N]);
    }
}
