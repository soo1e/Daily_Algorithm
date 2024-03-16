package B3.Day39;

import java.util.Scanner;

public class BOJ9295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            System.out.println("Case " + (i+1) + ": " + (X+Y));
        }
    }
}
