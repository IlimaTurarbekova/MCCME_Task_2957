import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a1 = n % m;
        int a2 = m % n;
        System.out.println(a1 * a2 + 1);
    }
}
