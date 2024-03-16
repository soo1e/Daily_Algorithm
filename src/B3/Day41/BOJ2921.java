package B3.Day41;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ2921 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                sum = sum + (i + j);
            }
        }
        System.out.println(sum);
    }
}
