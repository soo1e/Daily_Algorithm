package Day5;

import java.util.Scanner;

public class BOJ2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 4 == 0 && (! (N % 100 == 0) || (N % 400 == 0))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
