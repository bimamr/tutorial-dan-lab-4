package T4Q2B;

public class T4Q2B {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        do {
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
        } while (x < 100);
    }
}
