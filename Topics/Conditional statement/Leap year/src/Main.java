import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leap;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leap =  true;
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}