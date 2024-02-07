package B4.Day5;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {

            int A = scanner.nextInt();
            if (A < 40) {
                A = 40;
            }
            arr[i] = A;
        }
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        avg = sum / 5;
        System.out.println(avg);
    }
}
