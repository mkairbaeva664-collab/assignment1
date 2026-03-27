import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printDigits(sc.nextInt());
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            printDigits(n / 10);
            System.out.println(n % 10);
        }
    }
}
