package B4.etc;

import java.util.Scanner;

public class BOJ23495 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int N = scanner.nextInt();
            if (N == -1) {
                break;
            }
            sum = sum + N;
        }
        System.out.println(sum);
    }
}
