package L4Q6;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE);
        int temp = number;
        int digits = 0;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        System.out.println("Random integer: " + number);
        System.out.println("Number of digits: " + digits);
    }
}
