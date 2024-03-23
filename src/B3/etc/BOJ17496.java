package B3.etc;

import java.util.Scanner;

public class BOJ17496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int C = scanner.nextInt();
        int P = scanner.nextInt();

        int sum = 0;

        for (int i = T; i <= N; i += T) { // 첫 번째 스타후르츠를 심는 날부터 시작하여 매 T일마다 스타후르츠를 심음
            sum += C * P;
        }
        System.out.println(sum);
    }
}
