package B4.Day12;

import java.util.Scanner;

public class BOJ24263 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];
        MenOfPassion(array, N);
    }

    public static int MenOfPassion(int[] arr, int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
