package L4Q4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): ");
        int firstDay = input.nextInt();

        if (firstDay < 0 || firstDay > 6) {
            System.out.println("Invalid first day.");
            input.close();
            return;
        }

        int[] daysInMonth = {
            31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int mayFirstDay = firstDay;
        for (int month = 1; month < 5; month++) {
            mayFirstDay = (mayFirstDay + daysInMonth[month - 1]) % 7;
        }

        int augustFirstDay = mayFirstDay;
        for (int month = 5; month < 8; month++) {
            augustFirstDay = (augustFirstDay + daysInMonth[month - 1]) % 7;
        }

        printMonth("May", year, mayFirstDay, daysInMonth[4]);
        printMonth("August", year, augustFirstDay, daysInMonth[7]);

        input.close();
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void printMonth(String name, int year, int firstDay, int totalDays) {
        System.out.println("\n       " + name + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
