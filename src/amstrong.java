import java.util.Scanner;


public class amstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n,r,s=0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("amstrong number");
		System.out.println("enter a number");
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
			
		}
		if(s==temp)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number is not amstrong");
		}

	}

}
