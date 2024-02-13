package B4.Day19;

import java.util.Scanner;

public class BOJ16486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        double pi = 3.141592;

        double sum = ( 2 * d1 ) + ( 2 * d2 * pi);

        System.out.println(sum);
    }
}
