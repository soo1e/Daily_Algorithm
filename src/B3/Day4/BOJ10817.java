package B3.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] array = {A, B, C};

        Arrays.sort(array);

        System.out.println(array[1]);
    }
}