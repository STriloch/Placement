public class Main
{
	public static void main(String[] args) {
		int val=123456;
		int oddSum=0,evenSum=0;
		while(val>0)
		{
		    int digit = val%10;
		    val=val/10;
		    if (digit%2 == 1)
		    {
		        oddSum=oddSum+ digit;
		    }
		    else
		        evenSum= evenSum + digit;
		}
		System.out.println("Odd Sum"+oddSum+"\t Even Sum"+evenSum);
	}
}