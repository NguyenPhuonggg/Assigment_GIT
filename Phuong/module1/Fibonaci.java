public class Fibonaci {
    public int calculate(int n, boolean flag) {
        if (flag) {
            // Logic Đệ quy (Từ branch impl1)
            if (n <= 1) {
                return n;
            }
            return calculate(n - 1, true) + calculate(n - 2, true);
        } else {
            // Logic Vòng lặp (Từ branch impl2)
            if (n <= 1) {
                return n;
            }
            int t1 = 0;
            int t2 = 1;
            int sum = 0;
            
            for (int i = 2; i <= n; i++) {
                sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            return t2;
        }
    }
}