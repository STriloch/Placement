import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number : ");
        int n =sc.nextInt();
        scanner.close();
        
        int sum=0;
        int temp=n;
        int div=0;
        int pro=0;
        
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        
        for(int i = 1;i <= n/2;i++){
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }
        
        for(int i=0;i*(i + 1) <= n;i++)
        {
            if(i * (i+1) == num){
                pro=1;
            }
        }
        if(pro == 1)
        {
            System.out.println(" ");
        }
    }
}