package B4.Day20;

import java.util.Scanner;

public class BOJ14489 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine();
        int C = scanner.nextInt();

        if ((C * 2) <= A + B) {
            System.out.println((A+B) - (C * 2));
        } else {
            System.out.println(A+B);
        }
    }
}
