package recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digit(34545346));
    }

    public static int digit(int n) {
        if (n % 10 == n) {
            return n;
        } else {
            return n % 10 + digit(n / 10);
        }
    }
}