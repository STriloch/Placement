public class Solution {
    public static int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }
        
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;
        
        int quotient = 0;
        
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        
        return isNegative ? -quotient : quotient;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Result: " + divide(10, 3));  
        System.out.println("Result: " + divide(7, -3));  
        System.out.println("Result: " + divide(-2147483648, -1));  
    }
}
