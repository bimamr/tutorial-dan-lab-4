package T4Q1A;

public class T4Q1A {
    public static void main(String[] args) {
        int n = 0;
        while ((n + 1) * (n + 1) * (n + 1) < 2000) {
            n++;
        }
        System.out.println("Largest integer n: " + n);
    }
}
