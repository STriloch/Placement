import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        if (isCircularPrime(num)) {
            System.out.println(num + " is a circular prime number.");
        } else {
            System.out.println(num + " is not a circular prime number.");
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isCircularPrime(int num) {
        int count = countDigits(num);
        int temp = num;
        
        for (int i = 0; i < count; i++) {
            if (!isPrime(temp)) {
                return false;
            }
            temp = rotateNumber(temp, count);
        }
        return true;
    }
    
    public static int rotateNumber(int num, int count) {
        int rem = num % 10;
        int div = num / 10;
        int mul = 1;
        
        for (int i = 1; i < count; i++) {
            mul *= 10;
        }
        
        return rem * mul + div;
    }
    
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
