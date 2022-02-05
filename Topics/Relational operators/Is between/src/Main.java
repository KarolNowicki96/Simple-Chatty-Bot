import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean flag = (b >= a && a >= c) || (c >= a && a >= b);

        System.out.println(flag);
    }

}