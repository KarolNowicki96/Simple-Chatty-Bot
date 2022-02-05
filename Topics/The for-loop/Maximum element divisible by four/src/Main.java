import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputsCount = scanner.nextInt();
        int currentInput;
        int maxDiv = 0;

        for (int i = 0; i < inputsCount; i++) {
            currentInput = scanner.nextInt();
            if (currentInput % 4 == 0 && currentInput > maxDiv) {
                maxDiv = currentInput;
            }
        }

        System.out.println(maxDiv);
    }
}