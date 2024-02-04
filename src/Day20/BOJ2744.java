package Day20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String str2 = str;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                 Character.toLowerCase(str2.charAt(i));
            } else {
                Character.toUpperCase(str2.charAt(i));
            }
        }

        System.out.println(str2);
    }
}
