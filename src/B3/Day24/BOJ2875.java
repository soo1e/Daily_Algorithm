package B3.Day24;

import java.util.Scanner;

public class BOJ2875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int group = 0;

        while (W >= 2 && M >= 1 && W+M - 3 >= K) {
            W = W - 2;
            M = M - 1;
            group++;
        }

        System.out.println(group);
        scanner.close();
    }
}
