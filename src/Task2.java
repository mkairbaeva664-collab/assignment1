import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Array(arr, 0, sc);
        double sum = sum(arr, n);
        System.out.println(sum / n);
    }

    public static void Array(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        Array(arr, i + 1, sc);
    }

    public static double sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }
}