package recursion;

public class Add {

    public static void main(String[] args) {
        System.out.println(add(10));//print statement
    }
    public static int add(int n) {
        // Best Case.
        if (n<=1){
            return n;
        }

        return add(n-1)+n; // recursion call
    }
}
