import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(dig(sc.next()));
    }

    public static String dig(String s) {
        if (s.isEmpty()) return "Yes";
        if (s.charAt(0) < '0' || s.charAt(0) > '9') return "No";
        return dig(s.substring(1));
    }
}
