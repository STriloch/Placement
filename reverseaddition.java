class Main
{
	public static void main(String args[])
	{
		int sum1,k;
		int [] A= {5,1,3};
		int [] B= {9,7,7,7};
		int [] c=new int[A.length+1];
		int  carry=0,i=0,j=0,sum=0;

		while(i<A.length)
		{
			if(i<A.length == j<B.length) {
				sum=A[i]+B[i]+carry;
				c[i]=sum%10;
				carry=sum/10;
			}
			i++;
		}
		c[i]=carry;
		for( j=0;j<=i;j++)
		System.out.println(c[j]);
	}
    	
}