import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Prime(n, 2));
    }

    public static String Prime(int n, int d) {
        if (n == 1) return "Composite";
        if (d >= n) return "Prime";
        if (n % d == 0) return "Composite";
        return Prime(n, d + 1);
    }
}
