import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        String check = "J";
        boolean flag = false;

        if (test.toUpperCase().startsWith(check)) {
            flag = true;
        }
        System.out.println(flag);
    }
}