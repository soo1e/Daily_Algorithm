package B4.Day5;

import java.util.Scanner;

public class BOJ3046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int S = scanner.nextInt();
        int R2 = (2*S) - R1;

        System.out.println(R2);
    }
}
