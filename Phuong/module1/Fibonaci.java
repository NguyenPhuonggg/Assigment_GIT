public class Fibonaci{
    public static int fibonacciRecursion(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
 }
}