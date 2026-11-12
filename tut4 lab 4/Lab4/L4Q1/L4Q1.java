package L4Q1;

import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        System.out.print("The factors are: ");
        boolean first = true;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
        } else if (number < 0) {
            for (int i = number; i <= -1; i++) {
                if (number % i == 0) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
            for (int i = 1; i <= Math.abs(number); i++) {
                if (number % i == 0) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
        } else {
            System.out.print("Every non-zero integer");
        }

        System.out.println();
        input.close();
    }
}
