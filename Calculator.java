public class Calculator {

    public double calculate(String sign, double arg1, double arg2) {
        switch (sign.toUpperCase()) {
            case "PLUS":
                return arg1 + arg2;
                
            case "MINUS":
                return arg1 - arg2;
            case "MULTIPLY":
                return arg1 * arg2;  
            case "DIVIDE":
                if (arg2 == 0) {
                    System.out.println("Lỗi: Chia cho số không.");
                    return 0;
                }else{
                    return arg1 / arg2;
                } 
            default:
                System.out.println("Toán tử không hợp lệ: " + sign);
                return 0;
        }
    }
}