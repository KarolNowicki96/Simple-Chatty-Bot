import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean ifPossible;

        ifPossible = n == k || m == k;

        if (!ifPossible) {
            for (int i = 1; i <= n; i++) {
                if (i * m == k) {
                    ifPossible = true;
                }
            }
        }

        if (!ifPossible) {
            for (int i = 1; i <= m; i++) {
                if (i * n == k) {
                    ifPossible = true;
                }
            }
        }
        if (ifPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}