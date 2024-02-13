package B4.Day16;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= N; i++) {
            String s = scanner.nextLine();
            System.out.println((i)+ ". " + s);
        }
    }
}
