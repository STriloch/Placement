class Main
{
    public static void main(String []args)
    {
        int num=5;
        int count=0;
        for(int i=1;i<=(num/2)+1;i=i+2)
        {
            if(num%i == 0)
            count++;
        }
        if(count == 1)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a prime Number");
        }
    }
}