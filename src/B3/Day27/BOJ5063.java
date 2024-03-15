package B3.Day27;

import java.util.Scanner;

public class BOJ5063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();
            if (r + c < e) {
                System.out.println("advertise");
            } else if (r + c == e) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
