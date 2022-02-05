import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num;
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println(reverse);
    }
}