import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double counter = 0;
        double sum = 0;
        double result;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                counter++;
                sum += i;
            }
        }

        result = sum / counter;
        System.out.println(result);
    }
}