package T4Q4;

import java.util.Scanner;

public class T4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

        System.out.println();
        input.close();
    }
}
