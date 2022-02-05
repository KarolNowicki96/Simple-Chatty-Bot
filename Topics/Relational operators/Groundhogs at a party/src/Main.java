import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean ifWeekend = scanner.nextBoolean();
        boolean ifSuccesful;
        if (ifWeekend) {
            if (cups >= 15 && cups <= 25) {
                ifSuccesful = true;
            } else {
                ifSuccesful = false;
            }
        } else {
            if (cups >= 10 && cups <= 20) {
                ifSuccesful = true;
            } else {
                ifSuccesful = false;
            }
        }

        System.out.println(ifSuccesful);
    }
}