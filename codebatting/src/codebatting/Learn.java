import java.util.Scanner;
public class Learn
{
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		try
		{
		if(age<18)
		{
			throw new Youngage("your are not eligible to vote");
		}
		else
		{
			System.out.println("you can vote succesfully");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
class Youngage extends RuntimeException
{
	public Youngage(String s)
	{
		super(s);
	}
}