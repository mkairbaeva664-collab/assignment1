import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            array(arr, 0, sc);
            rev(arr, n);
        }
    }

    public static void array(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        array(arr, i + 1, sc);
    }

    public static void rev(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        rev(arr, n - 1);
    }
}