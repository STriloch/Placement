import java.util.Scanner;
class Student
{
	void get(String name,int num)
	{
		System.out.println("Name:" + name + ",Regno:" + num);

	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		for(int i=1;i<=5;i++);
		{
		System.out.println("Enter your Name:");
		String name=in.nextLine();
		System.out.println("Enter your Regno:");
		int num=in.nextInt();
		in.nextLine();
		
		Student student =new Student();
		student.get(name,num);
		}
		in.close();
		
	}
}