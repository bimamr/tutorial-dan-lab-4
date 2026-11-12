package T4Q1C;

import java.util.Random;

public class T4Q1C {
    public static void main(String[] args) {
        Random random = new Random();

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.printf("%4d", random.nextInt(101));
            }
            System.out.println();
        }
    }
}
