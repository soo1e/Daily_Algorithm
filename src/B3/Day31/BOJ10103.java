package B3.Day31;

import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

public class BOJ10103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CY = 100;
        int SD = 100;
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A < B) {
                CY = CY - B;
            } else if (A > B) {
                SD = SD - A;
            }
        }
        System.out.println(CY);
        System.out.println(SD);
    }
}
