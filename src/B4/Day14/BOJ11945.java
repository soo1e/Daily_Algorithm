package B4.Day14;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                String str = scanner.nextLine();
                StringBuffer sb = new StringBuffer(str);
                String reversedStr = sb.reverse().toString();
                System.out.println(reversedStr);
            }
        }
    }
}
