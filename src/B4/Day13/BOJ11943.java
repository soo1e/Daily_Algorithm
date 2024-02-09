package B4.Day13;

import java.util.Scanner;

// TODO 손으로 풀어보기
public class BOJ11943 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int appleSum = 0;
        int orangeSum = 0;

        if (A > B) {
            appleSum = A;
        } else {
            appleSum = B;
        }

        if (C > D) {
            orangeSum = D;
        } else {
            orangeSum = C;
        }

        System.out.println(appleSum + orangeSum);
    }
}
