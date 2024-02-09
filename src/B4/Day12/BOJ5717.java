package B4.Day12;

import java.util.Scanner;

public class BOJ5717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int M = scanner.nextInt();
            int F = scanner.nextInt();
            if ( M == 0 && F == 0 ) {
                break;
            }
            System.out.println(M + F);

        }


    }
}
