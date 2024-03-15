package B3.Day28;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        int sum = 0;

        // 가장 긴 막대와 나머지 두 막대의 합을 비교하여 가장 큰 둘레를 만듦
        sum = Math.max(sum, arr[0] + arr[1] + arr[2]);

        System.out.println(sum);
    }
}