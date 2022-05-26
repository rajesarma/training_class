package core.core;

public class TestFactorial {

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1 );      // 5 * (4  * ( 3 * 2 * 1))
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
