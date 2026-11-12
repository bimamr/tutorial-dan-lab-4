package T4Q1E;

public class T4Q1E {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 25; i++) {
            sum += (double) i / (26 - i);
        }

        System.out.printf("Sum: %.2f%n", sum);
    }
}
