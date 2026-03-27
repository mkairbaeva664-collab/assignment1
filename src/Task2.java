import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = sum(arr, n);
        System.out.println((double) s/n);
    }

    public static int sum(int[] arr, int size) {
        if(size <= 0) {
            return 0;
        }
        return arr[size - 1] + sum(arr, size-1);
    }
}
