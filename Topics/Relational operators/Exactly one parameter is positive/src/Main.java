import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int num = 0;

        boolean flag;

        if (a > num && b <= num && c <= num) {
            flag = true;
        } else if (a <= num && b > num && c <= num) {
            flag = true;
        } else if (a <= num && b <= num && c > num) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }
}