package B4.Day11;

import java.util.Scanner;

public class BOJ10987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.equals("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
                sum = sum + 1;
            }
        }

        System.out.println(sum);
    }
}
