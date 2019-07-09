import java.util.Scanner;


public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b="";
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string you want to check");
		a=s.nextLine();
		int n=a.length();
		for(i=n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
			
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("string is palindrome");
			
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
		
		

	}

}
