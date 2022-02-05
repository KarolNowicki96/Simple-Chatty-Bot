import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, h, currentHeight = 0, counter = 0;
        h = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        while (h > currentHeight) {
            currentHeight += a;
            if (currentHeight >= h) {
                counter++;
                break;
            }
            currentHeight -= b;
            counter++;
        }

        System.out.println(counter);
    }
}