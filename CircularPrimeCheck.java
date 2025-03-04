public class CircularPrimeCheck {
	static int isPrime(int num) {
		if (num < 2) {
			return 0;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	static int countDigits(int num) {
		int count = 0;
		int temp = num;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		return count;
	}

	static int power(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		return result;
	}

	 static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    static int rotateNumber(int num, int length) {
        int lastDigit = num % 10;
        num /= 10; 
        int power = power(10, length - 1); 
        return lastDigit * power + num; 
    }

    static int isCircularPrime(int num) {
        int temp = num;
        int length = countDigits(num);
        
        for (int i = 0; i < length; i++) {
            int primeCheck = isPrime(temp);
            if (primeCheck == 0) {
                return 0;
            }
            temp = rotateNumber(temp, length);
        }
        return 1;
    }

    public static void main(String[] args) {
        int num = 2468;  
        int circularPrimeCheck = isCircularPrime(num);
        if (circularPrimeCheck == 1) {
            System.out.println(num + " is a Circular Prime!");
        } else {
            System.out.println(num + " is NOT a Circular Prime.");
        }
    }
}