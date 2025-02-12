class Main
{
    public static void main(String []args)
    {
        int n=596,rem=0,res=0;
        while(n>0)
       {
          rem=n%10;
          n=n/10;
          res=res*10+rem;
          System.out.println(res);
       }
    }
}