package B5.Day11;

import java.util.Scanner;

public class BOJ18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int gap = 2541 - 1998;
        System.out.println(year - gap);
    }
}
