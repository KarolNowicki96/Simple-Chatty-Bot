import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs;
        int number;
        int result = 0;

        numberOfInputs = scanner.nextInt();

        for (int i = 0; i < numberOfInputs; i++) {
            number = scanner.nextInt();
            if (number % 6 == 0) {
                result += number;
            }
        }

        System.out.println(result);
    }
}