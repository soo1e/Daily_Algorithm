package B3.Day19;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String revStr = new StringBuilder(str).reverse().toString();
        if (str.equals(revStr)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
