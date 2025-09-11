package recursion;

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if (n<=1){ //best case
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
