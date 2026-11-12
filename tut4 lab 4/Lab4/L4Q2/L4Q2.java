package L4Q2;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        long total = 0;

        for (int i = 1; i <= n; i++) {
            total += (long) i * (i + 1) / 2;
        }

        System.out.println("Sum of the series: " + total);
        input.close();
    }
}
