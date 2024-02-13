package B4.Day17;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }
            if (age > 17 || weight >= 80) {
                System.out.println(name + " " + "Senior");
            } else {
                System.out.println(name + " " + "Junior");
            }
        }
    }
}
