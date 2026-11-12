    package L4Q8;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);
        int count = 0;
        int number = 2;

        System.out.println("Random n: " + n);
        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            boolean prime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        System.out.println();
    }
}
