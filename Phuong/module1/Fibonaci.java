public class Fibonaci {
    public int calculate(int n, boolean flag) {
        if (flag) {
            // Logic Đệ quy (Từ branch impl1)
            if (n <= 1) {
                return n;
            }
            return calculate(n - 1, true) + calculate(n - 2, true);
        } 
    }
}