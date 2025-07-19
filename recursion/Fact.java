package recursion;

public class Fact {


    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println();
        int sum = fact(5);
        System.out.println(digit(sum));
    }
    public static int digit(int sum) {
        if (sum % 10 == sum) {
            return sum;
        } else {
            return sum % 10 + digit(sum / 10);
        }
    }

    public static int fact(int n) {
        if (n==0 && n==1){
            return 1;
        }
        if(n==2) {
            return 2;
        }
       return fact(n-1)*n;
    }
}