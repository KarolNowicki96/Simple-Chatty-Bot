import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int suma = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a % 2 != 0) {
            a++;
        }
        if (b % 2 != 0) {
            b++;
        }
        if (c % 2 != 0) {
            c++;
        }

        suma = a + b + c;

        System.out.println(suma/2);
    }
}