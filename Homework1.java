class Main 
{
        public static void main(String[] args) {
                int sum = 0;
                String number = "";

                for (int i = 1; i <= 6; i++) {
                        number += "9";  
                        sum += Integer.parseInt(number);  
                }

                System.out.println("The sum is: " + sum);
        }
}