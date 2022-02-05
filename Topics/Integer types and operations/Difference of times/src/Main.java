import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e,f;
        int g1,g2;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();

        g1 = a * 3600 + b * 60 + c;
        g2 = d * 3600 + e * 60 + f;

        System.out.println(g2-g1);
    }
}